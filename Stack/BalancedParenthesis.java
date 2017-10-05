package Stack;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		System.out.println("Balanced parenthesis");
		Scanner scan = new Scanner(System.in);
		String string  = scan.next();
		boolean ans = true;
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<string.length()&& ans;i++){
			if((string.charAt(i)=='(')||(string.charAt(i)=='{')||(string.charAt(i)=='[')){
                  				stack.push(string.charAt(i));
			}
			else{
				char c = stack.pop();
				if(
				(string.charAt(i)==')' && c!='(') ||
				(string.charAt(i)=='}' && c!='{') ||
				(string.charAt(i)==']' && c!='[') ){
					ans = false;
				}
						
			}
		}
		if(!stack.isEmpty())
			ans = false;
		
		System.out.println(ans);
		
	}

}
