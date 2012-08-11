package patterns.behavioral.interpreter.example1.expression;

import patterns.behavioral.interpreter.example1.Context;
import patterns.behavioral.interpreter.example1.Expression;
import patterns.behavioral.interpreter.example1.OperationExpression;

public class IllegalExpression extends OperationExpression {

	public IllegalExpression(Expression left, Expression right) {
		super(left, right);
	}

	public double evaluate(Context c) {
		throw new IllegalArgumentException();
	}
}
