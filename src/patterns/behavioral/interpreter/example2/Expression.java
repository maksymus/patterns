package patterns.behavioral.interpreter.example2;

import java.util.Map;

public interface Expression {
	public double interpret(Map<String, Double> variables);
}
