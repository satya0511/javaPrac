package satya.prac.DSnCollections;

public class ClosestLeafToANode {
	public static int dis = Integer.MAX_VALUE;
	public static void closesLeafFromNode(TreeNod root , TreeNod node){
		if(root == null || node==null){
			return ;
		}
		if(root.getData() ==node.getData()){
			if(dis > minDistanceOfleafFromRoot(root)){
				dis = minDistanceOfleafFromRoot(root);
			}
			return ;
		}else{
			
			if(contains(root.getLeftChild(), node)){
				if(dis > 1+ minDistanceOfleafFromRoot(root.getRightChild()) + distanceBetweenRootAndNode(root, node)){
					dis =1+ minDistanceOfleafFromRoot(root.getRightChild()) + distanceBetweenRootAndNode(root, node) ;
				}
				closesLeafFromNode(root.getLeftChild(), node);
			}else{
				if(dis > 1+ minDistanceOfleafFromRoot(root.getLeftChild()) + distanceBetweenRootAndNode(root, node)){
					dis =1+ minDistanceOfleafFromRoot(root.getLeftChild()) + distanceBetweenRootAndNode(root, node) ;
				}
				closesLeafFromNode(root.getRightChild(), node);
			}
		}
		
	}
	
	public static boolean contains(TreeNod root , TreeNod node){
		if (root == null) return false ;
		if(node==null) return false;
		if(root.getData() == node.getData()) return true ;
		
		return contains(root.getLeftChild() , node)|| contains(root.getRightChild(), node);
		
	}
	
	public static int minDistanceOfleafFromRoot(TreeNod root){
		if(root == null){
			return -1;
		}
		if(root.getLeftChild() ==null && root.getRightChild()==null){
			return 0 ;
		}
		if(root.getLeftChild()==null){
			return 1+ minDistanceOfleafFromRoot(root.getRightChild());
		}
		if(root.getRightChild()==null){
			return 1+ minDistanceOfleafFromRoot(root.getLeftChild());
		}
		return 1 + Math.min(minDistanceOfleafFromRoot(root.getLeftChild()), minDistanceOfleafFromRoot(root.getRightChild()));
		
	}
	
	public static int distanceBetweenRootAndNode(TreeNod root , TreeNod node){
		if(root == null){
			return -1;
		}
		if(!contains(root, node)){
			return -1;
		}
		if(root.getData() == node.getData()){
			return 0;
		}
		if(contains(root.getLeftChild(), node)){
			return 1 + distanceBetweenRootAndNode(root.getLeftChild(), node);
		}else{
			return 1 + distanceBetweenRootAndNode(root.getRightChild(), node);
		}
		
	}
	
	public static void main(String args[]){
		TreeNod root= new TreeNod(10);
		root.setLeftChild(new TreeNod(12));
		root.setRightChild(new TreeNod(13));
		
		root.getRightChild().setLeftChild(new TreeNod(14));
		root.getRightChild().setRightChild(new TreeNod(15));
		
		root.getRightChild().getLeftChild().setLeftChild(new TreeNod(21));
		root.getRightChild().getLeftChild().setRightChild(new TreeNod(22));
		
		root.getRightChild().getRightChild().setLeftChild(new TreeNod(23));
		root.getRightChild().getRightChild().setRightChild(new TreeNod(24));
		
		root.getRightChild().getLeftChild().getLeftChild().setLeftChild(new TreeNod(1));
		root.getRightChild().getLeftChild().getLeftChild().setRightChild(new TreeNod(2));
		
		root.getRightChild().getLeftChild().getRightChild().setLeftChild(new TreeNod(3));
		root.getRightChild().getLeftChild().getRightChild().setRightChild(new TreeNod(4));
		
		root.getRightChild().getRightChild().getLeftChild().setLeftChild(new TreeNod(5));
		root.getRightChild().getRightChild().getLeftChild().setRightChild(new TreeNod(6));
		
		root.getRightChild().getRightChild().getRightChild().setLeftChild(new TreeNod(7));
		root.getRightChild().getRightChild().getRightChild().setRightChild(new TreeNod(8));
		
		System.out.println(distanceBetweenRootAndNode(root, new TreeNod(12)));
		
	    closesLeafFromNode(root, new TreeNod(2));
	    System.out.println(dis);
		
		//System.out.println(minDistanceOfleafFromRoot(root));
		
	}
	//Great , Thanks Papa :)

}



class TreeNod{
	private int data ;
	private TreeNod leftChild ;
	private TreeNod rightChild;
	public TreeNod(int data){
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNod getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNod leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNod getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNod rightChild) {
		this.rightChild = rightChild;
	}
	
}

