package BinaryTree;

public class BinaryTree {
	Node root;
	BinaryTree(int data){
		root = new Node(data);
	}
	
	void printPreOrder(Node node){
		if(node==null)
			return;
		System.out.println(node.data);
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
	void printInOrder(Node node){
		if(node==null)
			return;
		printInOrder(node.left);
		System.out.println(node.data);
		printInOrder(node.right);

	}

	void printPostOrder(Node node){
		if(node==null)
			return;
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.println(node.data);
		
	}
	
	
	public static void main(String[] args) {
			BinaryTree tree = new BinaryTree(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.printPreOrder(tree.root);
	        System.out.println("----");
	        tree.printInOrder(tree.root);
	        System.out.println("----");
	        tree.printPostOrder(tree.root);
		
	}

}
