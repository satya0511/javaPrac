package satya.prac.geeksforgeeks;

//Java program for an efficient solution to check if
//a given array can represent Preorder traversal of
//a Binary Search Tree
import java.util.Stack;

class BinarySearchTree {

 boolean canRepresentBST(int pre[], int n) {
     // Create an empty stack
     Stack<Integer> s = new Stack<Integer>();

     // Initialize current root as minimum possible
     // value
     int root = Integer.MIN_VALUE;
System.out.println(n);
     // Traverse given array
     for (int i = 0; i<=n-1; i++) {
         // If we find a node who is on right side
         // and smaller than root, return false
    	 System.out.println(i);
    	 System.out.println(root);
         if (pre[i] < root) {
        	
             return false;
         }

         // If pre[i] is in right subtree of stack top,
         // Keep removing items smaller than pre[i]
         // and make the last removed item as new
         // root.
         while (!s.empty() && s.peek() < pre[i]) {
             root = s.peek();
            
             s.pop();
         }
         

         // At this point either stack is empty or
         // pre[i] is smaller than root, push pre[i]
         s.push(pre[i]);
         
     }
     return true;
 }

 public static void main(String args[]) {
     BinarySearchTree bst = new BinarySearchTree();
     int[] pre1 = new int[]{40, 30, 35, 80, 100};
     //int[] pre1 = new int[]{4,7,5,13,17,15,10};
     int n = pre1.length;
     if (bst.canRepresentBST(pre1, n) == true) {
         System.out.println("true");
     } else {
         System.out.println("false");
     }
     int[] pre2 = new int[]{40, 30, 35, 20, 80, 100};
     //int[] pre2 = new int[]{4,3,5,13,14,15,10};
     int n1 = pre2.length;
     if (bst.canRepresentBST(pre2, n1) == true) {
         System.out.println("true");
     } else {
         System.out.println("false");
     }
 }
}

//This code is contributed by Mayank Jaiswal

