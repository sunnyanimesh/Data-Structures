package BinaryTree;

import java.util.*;

public class DiagnalTraversal {

	public static void main(String[] args) {
	    BinaryTree tree = new BinaryTree(8);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(14);
        tree.root.right.right.left = new Node(13);
        tree.root.left.right.left = new Node(4);
        tree.root.left.right.right = new Node(7);
         
        printDiagnal(tree.root);
	  
	}

	private static void printDiagnal(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		while(root!=null){
			queue.add(root);
			root = root.right;
		}
		
		
	
		
		while(!queue.isEmpty())
		{  Node temp = queue.poll();
			System.out.print(temp.data+" ");
			if(temp.left!=null)
			{	queue.add(temp.left);
				Node temp2 = temp.left;
				while(temp2.right!=null)
					{queue.add(temp2.right);
					temp2 = temp2.right;
					}
			}
			
			
		}
	}

}
