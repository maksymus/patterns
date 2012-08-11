package patterns.behavioral.interpreter.example1;


public abstract class OperationExpression implements Expression {
	protected Expression left;
	protected Expression right;
	
	public OperationExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
}
