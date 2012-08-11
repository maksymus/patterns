package patterns.behavioral.interpreter.example1.expression;

import patterns.behavioral.interpreter.example1.Context;
import patterns.behavioral.interpreter.example1.Expression;
import patterns.behavioral.interpreter.example1.OperationExpression;

public class AddExpression extends OperationExpression {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	public double evaluate(Context c) {
		return left.evaluate(c) + right.evaluate(c);
	}
}
