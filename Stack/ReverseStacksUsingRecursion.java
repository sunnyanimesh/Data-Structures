package Stack;
import java.util.*;

public class ReverseStacksUsingRecursion {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		int n = scan.nextInt();
		for(int i=0;i<n;i++)
		stack.push(scan.nextInt());
		System.out.println(stack);

		reverse(stack);
		System.out.println(reversed);
		
	}
	static Stack<Integer> reversed = new Stack<Integer>();
	public static void reverse(Stack<Integer> stack){
		int poped = (int) stack.pop();
		reversed.push(poped);
		if(!stack.empty())
			reverse(stack);
	}
}
