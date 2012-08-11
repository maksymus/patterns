package patterns.behavioral.interpreter.example1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OperationRegistry {
	private class OperationHandler <T extends OperationExpression> {
		public int priority;
		public Class<T> handler;

		public OperationHandler(int priority, Class<T> handler) {
			this.priority = priority;
			this.handler = handler;
		}
	}
	
	private Map<String, OperationHandler<? extends OperationExpression>> operations = 
		new HashMap<String, OperationHandler<? extends OperationExpression>>();
	
	public <T extends OperationExpression> void registerOperation(String operator, int priority, Class<T> handler) {
		operations.put(operator, new OperationHandler<T>(priority, handler));
	}
	
	public int getPriority(String operator) {
		return operations.get(operator).priority;
	}
	
	public boolean hasOperation(String operation) {
		return operations.containsKey(operation);
	}
	
	public String getOperators() {
		Set<String> keys = operations.keySet();
		String operators = "";
		for (String string : keys) {
			operators += string;
		}
		return operators;
	}
	
	public OperationExpression createHandler(String operator, Expression l, Expression r) {
		try {
			Class<? extends OperationExpression> handler = operations.get(operator).handler;
			Constructor<? extends OperationExpression> constructor = handler.getConstructor(Expression.class, Expression.class);
			return constructor.newInstance(l, r);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
