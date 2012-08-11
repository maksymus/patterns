package patterns.behavioral.interpreter.example2;

import java.util.Map;

public class Plus implements Expression {

	private Expression left;
	private Expression right;
	
	public Plus(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public double interpret(Map<String, Double> variables) {
		return left.interpret(variables) + right.interpret(variables);
	}
}
