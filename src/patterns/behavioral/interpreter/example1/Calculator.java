package patterns.behavioral.interpreter.example1;

import java.util.Stack;
import java.util.StringTokenizer;

import patterns.behavioral.interpreter.example1.expression.AddExpression;
import patterns.behavioral.interpreter.example1.expression.DivideExpression;
import patterns.behavioral.interpreter.example1.expression.IllegalExpression;
import patterns.behavioral.interpreter.example1.expression.MultiplyExpression;
import patterns.behavioral.interpreter.example1.expression.SubstractExpression;

public class Calculator {
	private static final String DELIM = " ";
	private final String operators;
	private String expression;
	private Context context;
	private OperationRegistry operationRegistry = new OperationRegistry();
	
	public Calculator(Context context, String expression) {
		this.expression = expression.replaceAll("\\s+", "");
		this.context = context;
		
		operationRegistry.registerOperation("+", 1, AddExpression.class);
		operationRegistry.registerOperation("-", 1, SubstractExpression.class);
		operationRegistry.registerOperation("*", 2, MultiplyExpression.class);
		operationRegistry.registerOperation("/", 2, DivideExpression.class);
		operationRegistry.registerOperation("(", 0, IllegalExpression.class);
		operationRegistry.registerOperation(")", 0, IllegalExpression.class);
		
		this.operators = operationRegistry.getOperators();
	}

	public double evaluate() {
		String postfixExpression = infixToPostfix();
		Expression rootNode = buildTree(postfixExpression);
		return rootNode.evaluate(context);
	}

	private Expression buildTree(String postfixExpression) {
		String[] vars = postfixExpression.split(DELIM);
		
		Stack<Expression> stack = new Stack<Expression>();
		for (String var: vars) {
			if(operationRegistry.hasOperation(var)) {
				Expression r = stack.pop();
				Expression l = stack.pop();
				
				Expression e = getNonTerminalExpression(var, l, r);
				stack.push(e);
			} else {
				stack.push(new TerminalExpression(var));
			}
		}
		
		return stack.pop();
	}

	private Expression getNonTerminalExpression(String var, Expression l,
			Expression r) {
		
		return operationRegistry.createHandler(var, l, r);
	}

	private String infixToPostfix() {
		
		StringBuffer postfix = new StringBuffer();
		Stack<String> stack = new Stack<String>();
		
		StringTokenizer st = new StringTokenizer(expression, operators, true);
		while(st.hasMoreTokens()) {
			String token = st.nextToken();

			if(operators.contains(token)) {
				if(token.equals("(")) {
					stack.push(token);
				} else if(token.equals(")")) {
					while(!stack.peek().equals("(")) {
						postfix.append(stack.pop()).append(DELIM);
					}
					stack.pop();
				} else if(stack.empty()) {
					stack.push(token);
				} else if(!stack.empty()) {
					while(!stack.empty() && operationRegistry.getPriority(stack.peek()) >= operationRegistry.getPriority(token)) {
						postfix.append(stack.pop()).append(DELIM);
					}
					stack.push(token);
				}
			} else {
				postfix.append(token).append(DELIM);
			}
		}
		
		while(!stack.empty()) {
			postfix.append(stack.pop()).append(DELIM);
		}
		
		return postfix.toString();
	}
}
