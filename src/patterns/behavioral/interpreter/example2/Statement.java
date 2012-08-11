package patterns.behavioral.interpreter.example2;

import java.util.Map;
import java.util.Stack;

// a b 3 + +
public class Statement {
	private String expression;

	public Statement(String expression) {
		this.expression = expression;
	}

	public double evaluate(Map<String, Double> context) {
		Stack<Expression> tree = new Stack<Expression>();

		for (String token : expression.split(" ")) {
			if (token.equals("+")) {
				Plus plusExpression = new Plus(tree.pop(), tree.pop());
				tree.push(plusExpression);
			} else if (token.matches("^\\d*.?\\d+$")) {
				Number numberExpression = new Number(Double.valueOf(token));
				tree.push(numberExpression);
			} else {
				Variable variable = new Variable(token);
				tree.push(variable);
			}
		}

		return tree.pop().interpret(context);
	}
}
