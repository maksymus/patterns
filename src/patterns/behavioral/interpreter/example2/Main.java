package patterns.behavioral.interpreter.example2;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, Double> variables = new HashMap<String, Double>();
		variables.put("a", 3.1);
		variables.put("b", 2.6);
		
		double res = new Statement("a b .3 + +").evaluate(variables);
		System.out.println(res);
	}
}
