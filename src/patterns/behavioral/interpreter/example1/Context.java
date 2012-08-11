package patterns.behavioral.interpreter.example1;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Context {

	private Map<String,Integer> varMap = new HashMap<String,Integer>();  
	
	public double getValue(String var) {
		if(Pattern.compile("\\d*\\.?\\d*").matcher(var).matches()) {
			return Double.valueOf(var);
		}
		
		if(!varMap.containsKey(var)) {
			System.out.println("no variable: " + var);
			return 0;
		}
		
		return varMap.get(var);
	}
	
	public void putValue(String var, int value) {
		varMap.put(var, value);
	}
}

