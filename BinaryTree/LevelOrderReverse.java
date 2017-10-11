package BinaryTree;
import java.util.*;

public class LevelOrderReverse {

	
	public static void main(String[] args){
		BinaryTree binaryTree = new BinaryTree(5);
		binaryTree.root.left = new Node(2);
		binaryTree.root.right = new Node(3);
		binaryTree.root.left.right = new Node(5);
		binaryTree.root.right.right = new Node(7);
		reverseLevelOrder(binaryTree.root);

	
	}

	private static void reverseLevelOrder(Node root) {
		if(root == null)
			return;
		Queue<Node> queue = new LinkedList<Node>();
		Stack<Node> stack = new Stack<Node>();
		
		queue.add(root);
		
		while(queue.size()>0){
			Node temp = queue.poll();
			stack.add(temp);
			if(temp.left!=null)
				queue.add(temp.left);
			if(temp.right!=null)
				queue.add(temp.right);
			
		     }
    
	    while(!stack.isEmpty()){
	    	System.out.println(stack.pop().data);
	    }
	
	}
}

