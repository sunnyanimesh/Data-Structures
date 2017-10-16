package BinaryTree;

public class anticlockWiseTraversal {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(1);
        tree.root.right = new Node(2);
        tree.root.right.right = new Node(4);
        tree.root.right.right.right = new Node(5);
        tree.root.right.right.right.right = new Node(6);
        tree.root.right.right.right.right.right = new Node(7);
        tree.root.right.right.right.right.right.left = new Node(8);

        
 
	        printBoundary(tree.root);
	  
	}

	private static void printBoundary(Node root) {	
		if(root == null)
			return;
		System.out.print(root.data + " ");
		printLeftBoundary(root.left);
		printleaves(root);
		printRightBoundary(root.right);
		
	}

	private static void printLeftBoundary(Node root) {
		if(root == null)
			return;
		
		if(root.left!=null)
		{
			System.out.print(root.data + " ");
			printLeftBoundary(root.left);
		}
		else if(root.right!=null){
			System.out.print(root.data + " ");
			printLeftBoundary(root.right);
		}
	}

	private static void printleaves(Node root) {
		if(root==null)
			return;
		if(root.left==null && root.right==null)
			System.out.print(root.data + " ");
		else{
			printleaves(root.left);
			printleaves(root.right);
		}
		
		
	}

	private static void printRightBoundary(Node root) {
		if(root == null)
			return;
		
		if(root.right!=null)
		{
			printRightBoundary(root.right);
			System.out.print(root.data + " ");
		}
		else if(root.left!=null){

			printRightBoundary(root.left);
			System.out.print(root.data + " ");
		}
	
	}

}
