package satya.prac.DSnCollections;

	
	// Java program to print to print root to leaf path sum equal to
	// a given number
	 
	// A binary tree node

class Node_for_pathSum {
	 
    int data;
    Node_for_pathSum left, right;
 
    Node_for_pathSum(int item) {
        data = item;
        left = right = null;
    }
}
	
	 
	class BinaryTree_pathSum {
	 
	    static Node_for_pathSum root;
	     
	    /*
	     Given a tree and a sum, return true if there is a path from the root
	     down to a leaf, such that adding up all the values along the path
	     equals the given sum.
	  
	     Strategy: subtract the node value from the sum when recurring down,
	     and check to see if the sum is 0 when you run out of tree.
	     */
	  
	 
	    boolean haspathSum(Node_for_pathSum node, int sum) {
	        if (node == null) {
	            return (sum == 0);
	        } else {
	            boolean ans = false;
	 
	            /* otherwise check both subtrees */
	            int subsum = sum - node.data;
	            if (subsum == 0 && node.left == null && node.right == null) {
	                return true;
	            }
	            if (node.left != null) {
	                System.out.println( ans = ans || haspathSum(node.left, subsum));
	                System.out.println("left");
	                
	            }
	            if (node.right != null) {
	                System.out.println(ans = ans || haspathSum(node.right, subsum));
	                System.out.println("right");
	            }
	            return ans;
	        }
	    }
	    
	 
	    public static void main(String args[]) {
	        int sum = 14;
	        BinaryTree_pathSum tree = new BinaryTree_pathSum();
	        tree.root = new Node_for_pathSum(10);
	        tree.root.left = new Node_for_pathSum(8);
	        tree.root.right = new Node_for_pathSum(2);
	        tree.root.left.left = new Node_for_pathSum(3);
	        tree.root.left.right = new Node_for_pathSum(5);
	        tree.root.right.left = new Node_for_pathSum(2);
	 
	        if (tree.haspathSum(root, sum)) {
	            System.out.println("There is a root to leaf path with sum " + sum);
	        } else {
	            System.out.println("There is no root to leaf path with sum " + sum);
	        }
	    }
	    
	    
	    
	}
	 
	// This code has been contributed by Mayank Jaiswal

