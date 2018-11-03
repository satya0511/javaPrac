package satya.prac.DSnCollections;

public class floorAndCielinginBST {

	  static Node root;
	  Node zero=new Node(0);
	 
	 
	public Node  BTfloorUtil(Node root,int data){
		Node prv=null;
		return BTfloor(root.left,prv,data);
	 }
	
	
	public Node BTfloor(Node root, Node prv, int data) {
		// TODO Auto-generated method stub
		if(root==null){return null;}
		Node nd=BTfloor(root.left,prv,data);
		if(!(nd==null)){
			return zero;
		}
		if(root.data==data){return root;}
		if(root.data>data){return prv;}
		prv=root;
		return BTfloor(root.right,prv,data);
		
	}


	public static void main(String argd[]){
	     BinaryTree tree = new BinaryTree();
	        tree.root = new Node(8);
	        tree.root.left = new Node(4);
	        tree.root.right = new Node(12);
	        tree.root.left.left = new Node(2);
	        tree.root.left.right = new Node(6);
	        tree.root.right.left = new Node(10);
	        tree.root.right.right = new Node(14);
	        
	        Node Ans=new floorAndCielinginBST().BTfloorUtil(tree.root,1);
	        System.out.println(Ans.data);
}
}
