/**
 * 
 */
package ac.bristol.bragaglia.xhail.core;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.TreeSet;

import ac.bristol.bragaglia.xhail.core.Problem.ModeBodyData;
import ac.bristol.bragaglia.xhail.predicates.Atom;
import ac.bristol.bragaglia.xhail.predicates.Builder;
import ac.bristol.bragaglia.xhail.predicates.Clause;
import ac.bristol.bragaglia.xhail.predicates.Literal;

/**
 * @author stefano
 *
 */
public class Kernel extends Modifiable {

	private static final String CLAUSE = "clause";

	private static final String LEVEL = "level";

	private static final String LITERAL = "literal";

	private static final String TCL = "try_clause_literal";

	public static final String UCL = "use_clause_literal";

	private static Atom generalize(Atom atom, Atom schema, Map<Atom, Builder> table, Set<Atom> vars, Set<Atom> types) {
		if (null == atom)
			throw new IllegalArgumentException("Illegal 'atom' argument in Explanation.generalize(Atom, Atom, Map<Atom, Builder>, Set<Atom>, Set<Atom>): "
					+ atom);
		if (null == schema)
			throw new IllegalArgumentException("Illegal 'schema' argument in Explanation.generalize(Atom, Atom, Map<Atom, Builder>, Set<Atom>, Set<Atom>): "
					+ schema);
		if (null == table)
			throw new IllegalArgumentException("Illegal 'table' argument in Explanation.generalize(Atom, Atom, Map<Atom, Builder>, Set<Atom>, Set<Atom>): "
					+ table);
		if (null == vars)
			throw new IllegalArgumentException("Illegal 'vars' argument in Explanation.generalize(Atom, Atom, Map<Atom, Builder>, Set<Atom>, Set<Atom>): "
					+ vars);
		if (null == types)
			throw new IllegalArgumentException("Illegal 'types' argument in Explanation.generalize(Atom, Atom, Map<Atom, Builder>, Set<Atom>, Set<Atom>): "
					+ types);
		Builder builder;
		int arityA = atom.arity();
		int arityS = schema.arity();
		String name = atom.name();
		String kind = schema.name();
		String[] parts = kind.split("_");
		if (4 == parts.length)
			kind = parts[1];

		if (0 == arityA && 0 == arityS && name.equals(kind)) {
			builder = Builder.get(name);
		} else if ((1 == arityS || atom.equals(schema.get(0))) && (1 == arityS || 2 == arityS) && (Atom.PAR_INPUT.equals(kind) || Atom.PAR_OUTPUT.equals(kind))) {
			Builder var = table.get(atom);
			if (null == var) {
				var = Builder.get("V" + (1 + table.size()));
				table.put(atom, var);
			}
			builder = Builder.get(var);
			types.add(Builder.get(schema.get(arityS - 1).name()).append(var.build()).build());
			vars.add(var.build());
		} else if ((1 == arityS || atom.equals(schema.get(0))) && (1 == arityS || 2 == arityS) && (Atom.PAR_CONSTANT.equals(kind))) {
			builder = Builder.get(name);
			for (int i = 0; i < arityA; i++)
				builder.append(atom.get(i));
		} else if (0 == arityA && (1 == arityS || 2 == arityS) && (Atom.PAR_CONSTANT.equals(kind))) {
			builder = Builder.get(name);
		} else if (arityA > 0 && (1 == arityS || 2 == arityS) && (Atom.PAR_CONSTANT.equals(kind))) {
			builder = Builder.get(name);
			for (int i = 0; i < arityA; i++)
				builder.append(generalize(atom.get(i), schema.get(i), table, vars, types));
		} else if (arityA == arityS && name.equals(kind)) {
			builder = Builder.get(name);
			for (int i = 0; i < arityA; i++)
				builder.append(generalize(atom.get(i), schema.get(i), table, vars, types));
		} else {
			throw new UnsupportedOperationException("Atom: " + atom + " - Schema: " + schema + " [" + arityA + ", " + arityS + "]");
		}
		return builder.build();
	}

	private static Atom generalize(Atom atom, Map<Atom, Builder> table) {
		if (null == atom)
			throw new IllegalArgumentException("Illegal 'atom' argument in Explanation.generalize(Atom, Map<Atom, Builder): " + atom);
		if (null == table)
			throw new IllegalArgumentException("Illegal 'table' argument in Explanation.generalize(Atom, Map<Atom, Builder>): " + table);
		Atom result;
		if (Atom.TAG_NOTE.equals(atom.name()) && 5 == atom.arity()) {
			Set<Atom> vars = new TreeSet<>();
			Set<Atom> types = new TreeSet<>();
			Atom desired = generalize(atom.get(Atom.ID_ATOM), atom.get(Atom.ID_SCHEMA), table, vars, types);
			Builder bvars = Builder.get(Atom.TAG_VARS);
			for (Atom var : vars)
				bvars.append(var);
			Builder btypes = Builder.get(Atom.TAG_TYPES);
			for (Atom type : types)
				btypes.append(type);
			Atom accessors = Builder.get(Atom.TAG_ACCESSORS).append(bvars.build()).append(btypes.build()).build();
			result = Atom.annotate(atom.get(Atom.ID_LEVEL), desired, accessors, atom.get(Atom.ID_WEIGHT), atom.get(Atom.ID_PRIORITY));
		} else
			result = atom;
		return result;
	}

	public static Kernel generalize(Grounding grounding, Collection<Clause> explanations) {
		if (null == grounding)
			throw new IllegalArgumentException("Illegal 'grounding' argument in Kernel.generalize(Grounding, Collection<Clause>): " + grounding);
		if (null == explanations)
			throw new IllegalArgumentException("Illegal 'explanations' argument in Kernel.generalize(Grounding, Collection<Clause>): " + explanations);
		Kernel result = new Kernel(grounding);
		for (Clause clause : explanations) {
			Map<Atom, Builder> table = new Hashtable<>();
			Clause current = new Clause(generalize(clause.head(), table));
			for (Literal literal : clause)
				current.append(generalize(literal, table));
			result.addClause(current);
		}
		return result;
	}

	private static Literal generalize(Literal literal, Map<Atom, Builder> table) {
		if (null == literal)
			throw new IllegalArgumentException("Illegal 'literal' argument in Explanation.generalize(Literal, Map<Atom, Builder): " + literal);
		if (null == table)
			throw new IllegalArgumentException("Illegal 'table' argument in Explanation.generalize(Literal, Map<Atom, Builder>): " + table);
		return new Literal(literal.negated(), generalize(literal.atom(), table));
	}

	private static String join(Atom atom, int index) {
		if (null == atom)
			throw new IllegalArgumentException("Illegal 'atom' argument in Kernel.join(Atom, int): " + atom);
		if (index != Atom.ID_VARS && index != Atom.ID_TYPES)
			throw new IllegalArgumentException("Illegal 'index' argument in Kernel.join(Atom, int): " + index);
		StringJoiner joiner = new StringJoiner(", ");
		for (Atom term : atom.get(Atom.ID_ACCESSORS).get(index))
			joiner.add(term.toString());
		return joiner.toString();
	}

	private Set<Clause> clauses;

	private Set<Clause> dataset;

	private Grounding grounding;

	private Model model;

	private Kernel(Grounding grounding) {
		super();
		if (null == grounding)
			throw new IllegalArgumentException("Illegal 'grounding' argument in Kernel(Grounding): " + grounding);
		this.dataset = new LinkedHashSet<>();
		this.grounding = grounding;
		assert invariant() : "Illegal state in Kernel(Grounding)";
	}

	private boolean addClause(Clause clause) {
		if (null == clause)
			throw new IllegalArgumentException("Illegal 'clause' argument in Kernel.addClause(Clause): " + clause);
		boolean result = dataset.add(clause);
		if (result)
			this.update();
		assert invariant() : "Illegal state in Kernel.addClause(Clause)";
		return result;
	}

	public Collection<Clause> clauses() {
		if (null == clauses || isModified()) {
			deriveClauses();
			save();
		}
		assert invariant() : "Illegal state in Kernel.clauses()";
		return clauses;
	}

	public Model derive() {
		if (null == model || isModified()) {
			deriveClauses();
			save();
		}
		assert invariant() : "Illegal state in Kernel.derive()";
		return model;
	}

	private void deriveClauses() {
		clauses = new LinkedHashSet<>();
		model = grounding.problem().induce();
		if (dataset.size() > 0) {
			Map<Integer, StringJoiner> levels = new TreeMap<>();
			StringJoiner minimee = new StringJoiner(", ");
			int cc = 0;
			for (Clause clause : dataset) {
				cc += 1;
				Atom head = clause.head();
				Clause simple = new Clause(head.get(Atom.ID_ATOM));
				deriveLevel(cc, 0, new Literal(false, head), levels);

				// TODO possible errors with more complex problems?
				String heads = join(head, Atom.ID_TYPES);
				minimee.add(String.format("use_clause_literal(%d, 0) =%s @%s", cc, head.get(Atom.ID_WEIGHT), head.get(Atom.ID_PRIORITY)));

				deriveLiterals(cc, clause, simple, levels, heads, minimee);

				for (Atom type : head.get(Atom.ID_ACCESSORS).get(Atom.ID_TYPES)) {
					Literal literal = new Literal(false, type);
					if (!simple.contains(literal))
						simple.append(literal);
				}
				clauses.add(simple);

				if (levels.size() > 1)
					for (int lvl : levels.keySet()) {
						model.addClause(String.format("%s(%d, %d) :- %s.", LEVEL, cc, lvl, levels.get(lvl).toString()));
						// if (levels.containsKey(lvl + 1))
						model.addConstraint(String.format(":- not %s(%d, %d), %s(%d, %d).", LEVEL, cc, lvl, LEVEL, cc, lvl + 1));
					}
				model.addFact(String.format("%s(%d).", CLAUSE, cc));
			}
			model.addHide("#hide.");
			model.addShow(String.format("#show %s/2.", UCL));
			model.addMinimize(String.format("#minimize[ %s ].", minimee.toString()));
			model.addClause(String.format("{ %s(V1, 0) } :- clause(V1).", UCL));

		}
	}

	private void deriveLevel(int cc, int ll, Literal literal, Map<Integer, StringJoiner> levels) {
		int level = Integer.parseInt(literal.get(Atom.ID_LEVEL).toString());
		StringJoiner levelee = levels.get(level);
		if (null == levelee) {
			levelee = new StringJoiner(", ");
			levels.put(level, levelee);
		}
		levelee.add(String.format("%s(%d, %d)", UCL, cc, ll));
	}

	private void deriveLiterals(int cc, Clause clause, Clause simple, Map<Integer, StringJoiner> levels, String heads, StringJoiner minimee) {
		if (clause.count() > 0) {
			int ll = 0;
			Set<Literal> suffix = new TreeSet<>();
			StringJoiner attemptee = new StringJoiner(", ");

			for (Literal literal : clause) {
				ll += 1;
				Literal desired = new Literal(literal.negated(), literal.get(Atom.ID_ATOM));
				deriveLevel(cc, ll, literal, levels);

				String types = join(literal.atom(), Atom.ID_TYPES);
				String vars = join(literal.atom(), Atom.ID_VARS);
				String tries = String.format("%s(%d, %d, %s)", TCL, cc, ll, vars);
				attemptee.add(tries);
				minimee.add(String.format("%s(%d, %d) =%s @%s", UCL, cc, ll, literal.get(Atom.ID_WEIGHT), literal.get(Atom.ID_PRIORITY)));

				if (!simple.contains(desired))
					simple.append(desired);
				for (Atom type : literal.atom().get(Atom.ID_ACCESSORS).get(Atom.ID_TYPES))
					suffix.add(new Literal(false, type));

				model.addClause(String.format("{ %s(V1, V2) } :- %s(V1, V2), %s(V1).", UCL, LITERAL, CLAUSE));
				model.addClause(String.format("%s :- %s(%d, %d), %s, %s.", tries, UCL, cc, ll, types, desired.toString()));
				model.addClause(String.format("%s :- not %s(%d, %d), %s.", tries, UCL, cc, ll, types));
				model.addFact(String.format("%s(%d, %d).", LITERAL, cc, ll));
			}
			for (Literal literal : suffix)
				if (!simple.contains(literal))
					simple.append(literal);
			model.addClause(String.format("%s :- %s(1, 0), %s, %s.", simple.head().toString(), UCL, attemptee.toString(), heads));
		} else
			model.addClause(String.format("%s :- %s(1, 0), %s.", simple.head().toString(), UCL, heads));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kernel other = (Kernel) obj;
		if (clauses == null) {
			if (other.clauses != null)
				return false;
		} else if (!clauses.equals(other.clauses))
			return false;
		if (dataset == null) {
			if (other.dataset != null)
				return false;
		} else if (!dataset.equals(other.dataset))
			return false;
		if (grounding == null) {
			if (other.grounding != null)
				return false;
		} else if (!grounding.equals(other.grounding))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	public Atom get(int clause) {
		if (clause < 1 || clause > dataset.size())
			throw new IllegalArgumentException("Illegal 'clause' argument in Kernel.get(int): " + clause);
		Clause current = retrieve(clause - 1);
		Atom result = null == current ? null : current.head();
		assert invariant() : "Illegal state in Kernel.get(int)";
		return result;
	}

	public Literal get(int clause, int literal) {
		Clause current;
		if (clause < 1 || clause > dataset.size() || null == (current = retrieve(clause - 1)))
			throw new IllegalArgumentException("Illegal 'clause' argument in Kernel.get(int, int): " + clause);
		if (literal < 1 || literal > current.count())
			throw new IllegalArgumentException("Illegal 'literal' argument in Kernel.get(int, int): " + literal);
		Literal result = current.get(literal - 1);
		assert invariant() : "Illegal state in Kernel.get(int, int)";
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((clauses == null) ? 0 : clauses.hashCode());
		result = prime * result + ((dataset == null) ? 0 : dataset.hashCode());
		result = prime * result + ((grounding == null) ? 0 : grounding.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	private boolean invariant() {
		return (null != dataset && null != grounding);
	}

	public boolean isInducible() {
		boolean result = false;
		Iterator<Map<Literal, ModeBodyData>> iterator = grounding.problem().modes().values().iterator();
		while (!result && iterator.hasNext())
			result = iterator.next().size() > 0;
		result &= !dataset.isEmpty();
		assert invariant() : "Illegal state in Kernel.isInducible()";
		return result;
	}

	private Clause retrieve(int clause) {
		if (clause < 0 || clause >= dataset.size())
			throw new IllegalArgumentException("Illegal 'clause' argument in Kernel.retrieve(int): " + clause);
		if (null == clauses || isModified()) {
			deriveClauses();
			save();
		}
		Clause result;
		Iterator<Clause> iterator = clauses.iterator();
		if (iterator.hasNext()) {
			result = iterator.next();
			while (clause > 0 && iterator.hasNext()) {
				result = iterator.next();
				clause -= 1;
			}
		} else
			result = null;
		assert invariant() : "Illegal state in Kernel.retrieve(int)";
		return result;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Kernel [dataset=" + dataset + "]";
	}

	public Collection<Literal> types(int clause, int literal) {
		if (clause < 1 || clause > dataset.size())
			throw new IllegalArgumentException("Illegal 'clause' argument in Kernel.types(int, int): " + clause);
		Clause current;
		Iterator<Clause> iterator = dataset.iterator();
		if (iterator.hasNext()) {
			current = iterator.next();
			while (clause > 0 && iterator.hasNext()) {
				current = iterator.next();
				clause -= 1;
			}
		} else
			current = null;
		if (null == current)
			throw new IllegalArgumentException("Illegal 'clause' argument in Kernel.types(int, int): " + clause);
		if (literal < 0 || literal > current.count())
			throw new IllegalArgumentException("Illegal 'literal' argument in Kernel.types(int, int): " + literal);
		Set<Literal> result = new LinkedHashSet<>();
		Atom atom = 0 == literal ? current.head() : current.get(literal - 1).atom();
		for (Atom type : atom.get(Atom.ID_ACCESSORS).get(Atom.ID_TYPES))
			result.add(new Literal(false, type));
		assert invariant() : "Illegal state in Kernel.types(int, int)";
		return result;
	}

}