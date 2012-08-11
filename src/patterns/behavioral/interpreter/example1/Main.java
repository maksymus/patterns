package patterns.behavioral.interpreter.example1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    
    private static class Solution {
        private double d;
        private String expr;
        
        public Solution(double d, String expr) {
            this.d = d;
            this.expr = expr;
        }
        
        public double getD() {
            return d;
        }
        
        public String getExpr() {
            return expr;
        }
    }
    
    private static final String digits = "1346";
    private static final String ops = "+-*/";
    
    private static List<String> pDigits = new ArrayList<>();
    private static List<String> pOps = new ArrayList<>();
    
	public static void main(String[] args) {
//		Context context = new Context();
		
//		context.putValue("a", 2);
//		Calculator calculator = new Calculator(context, ".1+a*3/2 + (2+1)/3");
//		Calculator calculator = new Calculator(context, "");
//		System.out.println(calculator.evaluate());
	    
//		permutate(digits, pDigits);
//		permutate(ops, pOps);
//
//		List<String> expr = scramble(pDigits, pOps);
//		
//		calculate(expr);
		
        permutate(digits, pDigits);
        permutate(ops, pOps);

        List<String> expr = scramble(addBrackets(pDigits), pOps);

        calculate(expr);
	}

    private static void calculate(List<String> expr) {
        Queue<Solution> solutions = new PriorityQueue<>(expr.size(), new Comparator<Solution>() {

            @Override
            public int compare(Solution o1, Solution o2) {
                return Double.valueOf(o1.getD()).compareTo(Double.valueOf(o2.getD()));
            }
        });
        
        
        for (String string : expr) {
            Calculator calculator = new Calculator(new Context(), string);

            try {
                solutions.add(new Solution(calculator.evaluate(), string));
            } catch (Exception e) {
            }
        }
        
        while (!solutions.isEmpty()) {
            Solution solution = solutions.poll();
            System.out.println(solution.getExpr() + "=" + solution.getD());
        }
    }
	
	private static void permutate(String symbols, List<String> acc) {
	    permutate("", symbols, acc);
	}

    private static void permutate(String prefix, String symbols, List<String> acc) {
        if (symbols.length() == 1) {
            acc.add(prefix + symbols);
        } else {
            for (int i = 0; i < symbols.length(); i++) {
                permutate(prefix + symbols.charAt(i), remove(symbols, i), acc);
            }
        }
    }
	
    private static String remove(String symbols, int i) {
        return symbols.substring(0, i) + symbols.substring(i + 1, symbols.length());
    }
    
    private static List<String> scramble(List<String> digits, List<String> ops) {
        List<String> expr = new ArrayList<>();
        
        List<String> newOps = new ArrayList<>();
        
        for (String str : ops) {
            newOps.add(str.substring(0, 3));
        }
        
        for (String d : digits) {
            for (String o : newOps) {
                
                String e = "";
                
                for (int i = 0, j = 0 ; i < d.length(); i++ ) {
                    
                    e += String.valueOf(d.charAt(i));
                    
                    if (i < d.length() - 1 && d.charAt(i) != '(' && d.charAt(i + 1) != ')') { 
                        e += String.valueOf(o.charAt(j++));
                    }
                }
                
                expr.add(e.substring(0, e.length()));
            }
        }
        
        
        return expr;
    }
    
    private static List<String> addBrackets(List<String> digits) {
        List<String> brackets = new ArrayList<>();
        
        for (String digit: digits) {
            for (int i = 0; i < digit.length() - 1; i++) {
                for (int j = i + 2; j <= digit.length(); j++) {
                    int last = j > digit.length() ? digit.length() : j;
                    String e = digit.substring(0, i) +"(" + digit.substring(i, last) + ")" + digit.substring(last, digit.length());
                    brackets.add(e);
                }
            }
        }

        brackets.addAll(digits);
        
        return brackets;
    }
}
