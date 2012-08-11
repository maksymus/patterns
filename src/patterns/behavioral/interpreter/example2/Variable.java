package patterns.behavioral.interpreter.example2;

import java.util.Map;

public class Variable implements Expression {

	private String variable;
	
	public Variable(String variable) {
		this.variable = variable;
	}

	public double interpret(Map<String, Double> variables) {
		return variables.get(variable);
	}
}
