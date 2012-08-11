package patterns.behavioral.interpreter.example1;


public class TerminalExpression implements Expression {

	private String var;
	
	public TerminalExpression(String var) {
		this.var = var;
	}
	
	public double evaluate(Context c) {
		return c.getValue(var);
	}
}
