package Queue;
import java.util.*;
public class StackUsingQueue {
	public Queue<Integer> queue1 ;
	private int size ;
	
	StackUsingQueue(){
		 queue1 = new LinkedList<Integer>();
		 size=0;
	}
	void enqueue(int x)
	{
		queue1.add(x);
		size++;
	}
	void delqueue(){
		if(size==0){
			System.out.println("Stack empty");
			return;
		}
		for(int i=0;i<size-1;i++){
			int x = queue1.poll();
			queue1.add(x);
			
		}
		queue1.poll();
		size--;
	}
	
	
	
	public static void main(String[] args) {
		StackUsingQueue stack = new StackUsingQueue();
		stack.enqueue(1);
		System.out.println(stack.queue1);
		stack.enqueue(2);
		System.out.println(stack.queue1);
		stack.enqueue(3);
		System.out.println(stack.queue1);
		stack.enqueue(1);
		System.out.println(stack.queue1);
		stack.enqueue(2);
		System.out.println(stack.queue1);
		stack.enqueue(9);
		System.out.println(stack.queue1);
		stack.enqueue(7);
		System.out.println(stack.queue1);
		stack.enqueue(5);
		System.out.println(stack.queue1);
		stack.enqueue(4);
		System.out.println(stack.queue1);
		
		stack.delqueue();
		System.out.println(stack.queue1);
		stack.delqueue();
		System.out.println(stack.queue1);
		stack.delqueue();
		System.out.println(stack.queue1);
		
		
	}

}
