package BinaryTree;

public class LowestCommanAncestor {

	static Node LCA(Node root,int n1,int n2){
		if(root==null) {return null;}
		if(root.data==n1 || root.data == n2) {return root;}
		
		Node left = LCA(root.left,n1,n2);
		Node right = LCA(root.right,n1,n2);
		
		if(left!=null && right != null) {return root;}
		if(left==null && right == null) {return null;}
		
		return (left!=null)? left : right;
		
	}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        
        Node lca = LCA(tree.root,4,5);
        System.out.println(lca.data);
        
         lca = LCA(tree.root,4,6);
        System.out.println(lca.data);
        
         lca = LCA(tree.root,3,4);
        System.out.println(lca.data);
        
         lca = LCA(tree.root,4,2);
        System.out.println(lca.data);
}
}
