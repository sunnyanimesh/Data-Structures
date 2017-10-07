package BinaryTree;

import java.util.*;

public class LevelOrderTraversal {
	
	static void levelOrder(Node root){
		if(root == null) return;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);

		while(queue.size()>0){
			
				Node temp = queue.poll();
				System.out.println(temp.data);
				if(temp.left != null)
				queue.add(temp.left);
				if(temp.right != null)
				queue.add(temp.right);
	
		}
	
	
	}
	
	public static void main(String[] args){
		BinaryTree binaryTree = new BinaryTree(5);
			binaryTree.root.left = new Node(2);
			binaryTree.root.right = new Node(3);
			binaryTree.root.left.right = new Node(5);
			binaryTree.root.right.right = new Node(7);
			levelOrder(binaryTree.root);

		
		
	}
	
	
}
