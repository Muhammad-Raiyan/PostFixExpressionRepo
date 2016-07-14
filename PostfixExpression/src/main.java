import java.util.*;
import java.io.*;

public class main {

	public static void main(String[] args) throws IOException{
		
		Stack s = new LinkedStack();
		Scanner sc = new Scanner(System.in);
		String exp;
		
		System.out.println("Enter a postfix expression: ");
		System.out.flush();
		exp = sc.next();
		while(!exp.equals("0")){
			
			if(!isOperator(exp)) {
				s.push(Integer.parseInt(exp));
				//System.out.println(s.top());
			}
			else {
				int low = (int) s.pop();
				int high = (int) s.pop();
				int result;
				switch(exp){
				default: result = 0; break;
				case "+": result = high + low; break;
				case "-": result = high - low; break;
				case "*": result = high*low; break;
				case "/": result = high/low; break;
				
				}
				s.push(result);
				//System.out.println(result);
			}
			exp = sc.next();
			
		}
		System.out.println(s.top());
	}
	
	public static boolean isOperator(String x){
		
		if(x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/")) return true;
		else return false;
		
	}

}
