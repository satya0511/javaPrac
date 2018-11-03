package satya.prac.geeksforgeeks;

public class closestLeaftoANode {
	
	static void findLeafDown(Node root, int lev, Distance minDist) 
    {
          
        // base case
        if (root == null) 
            return;
  
        // If this is a leaf node, then check if it is closer
        // than the closest so far
        if (root.left == null && root.right == null) 
        {
        	
            if (lev < (minDist.minDis)){ 
                minDist.minDis = lev;
                System.out.println("\n data"+root.data);
            }
              
            return;
        }
  
        // Recur for left and right subtrees
        findLeafDown(root.left, lev + 1, minDist);
        findLeafDown(root.right, lev + 1, minDist);
    }
  
    // This function finds if there is closer leaf to x through 
    // parent node.
    static int findThroughParent(Node root, Node x, Distance minDist) 
    {
        // Base cases
        if (root == null) 
            return -1;
          
        if (root == x) 
            return 0;
          
        // Search x in left subtree of root
        int l = findThroughParent(root.left, x, minDist);
  
        // If left subtree has x
        if (l != -1) 
        {    
            // Find closest leaf in right subtree
        	System.out.println("l"+l+"--"+root.data);
            findLeafDown(root.right, l + 2, minDist);
            return l + 1;
        }
  
        // Search x in right subtree of root
        int r = findThroughParent(root.right, x, minDist);
  
        // If right subtree has x
        if (r != -1) 
        {
        	System.out.println("r"+r+"--"+root.data);
            // Find closest leaf in left subtree
            findLeafDown(root.left, r + 2, minDist);
            return r + 1;
        }
  
        return -1;
    }
  
    // Returns minimum distance of a leaf from given node x
    static int minimumDistance(Node root, Node x) 
    {
        // Initialize result (minimum distance from a leaf)
        Distance d = new Distance();
  
        // Find closest leaf down to x
        findLeafDown(x, 0, d);
  
        // See if there is a closer leaf through parent
        findThroughParent(root, x, d);
  
        return d.minDis;
    }
  

    public static void main(String[] args) 
    {
        BinaryTree tree = new BinaryTree();
          
        // Let us create Binary Tree shown in above example
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        
        tree.root.right.left = new Node(4);
        tree.root.right.left.left = new Node(6);
        tree.root.right.left.left.left = new Node(8);
        tree.root.right.left.left.left.left = new Node(10);
        tree.root.right.left.left.left.left.left = new Node(36);
        tree.root.right.left.left.left.left.right = new Node(37);
        tree.root.right.left.left.left.right = new Node(11);
        tree.root.right.left.left.left.right.left = new Node(38);
        tree.root.right.left.left.left.right.right = new Node(39);
        tree.root.right.left.left.right = new Node(9);
        tree.root.right.left.left.right.left = new Node(12);
        tree.root.right.left.left.right.left.left = new Node(40);
        tree.root.right.left.left.right.left.right = new Node(41);
        tree.root.right.left.left.right.right = new Node(13);
        tree.root.right.left.left.right.right.left = new Node(42);
        tree.root.right.left.left.right.right.right = new Node(43);
        tree.root.right.left.right = new Node(7);
        tree.root.right.left.right.left = new Node(16);
        tree.root.right.left.right.left.left = new Node(18);
        tree.root.right.left.right.left.left.left = new Node(44);
        tree.root.right.left.right.left.left.right = new Node(45);
        tree.root.right.left.right.left.right = new Node(19);
        tree.root.right.left.right.left.right.left = new Node(46);
        tree.root.right.left.right.left.right.right = new Node(47);
        tree.root.right.left.right.right = new Node(17);
        tree.root.right.left.right.right.left = new Node(20);
        tree.root.right.left.right.right.left.left = new Node(48);
        tree.root.right.left.right.right.left.right = new Node(49);
        tree.root.right.left.right.right.right = new Node(21);
        tree.root.right.left.right.right.right.left = new Node(50);
        tree.root.right.left.right.right.right.right = new Node(51);
        tree.root.right.right = new Node(5);
        tree.root.right.right.left = new Node(22);     
        tree.root.right.right.left.left = new Node(24);
        tree.root.right.right.left.left.left = new Node(28);
        tree.root.right.right.left.left.left.left = new Node(52);
        tree.root.right.right.left.left.left.right = new Node(53);
        tree.root.right.right.left.left.right = new Node(29);
        tree.root.right.right.left.left.right.left = new Node(54);
        tree.root.right.right.left.left.right.right = new Node(55);
        tree.root.right.right.left.right = new Node(25);
        tree.root.right.right.left.right.left = new Node(30);
        tree.root.right.right.left.right.left.left = new Node(56);
        tree.root.right.right.left.right.left.right = new Node(57);
        tree.root.right.right.left.right.right = new Node(31);
        tree.root.right.right.left.right.right.left = new Node(58);
        tree.root.right.right.left.right.right.right = new Node(59);
        tree.root.right.right.right = new Node(23);
        tree.root.right.right.right.left = new Node(26);
        tree.root.right.right.right.left.left = new Node(32);
        tree.root.right.right.right.left.left.left = new Node(60);
        tree.root.right.right.right.left.left.right = new Node(61);
        tree.root.right.right.right.left.right = new Node(33);
        tree.root.right.right.right.left.right.left = new Node(62);
        tree.root.right.right.right.left.right.right = new Node(63);
        tree.root.right.right.right.right = new Node(27);
        tree.root.right.right.right.right.left = new Node(34);
        tree.root.right.right.right.right.left.left = new Node(64);
        tree.root.right.right.right.right.left.right = new Node(65);
        tree.root.right.right.right.right.right = new Node(35);
        tree.root.right.right.right.right.right.left = new Node(66);
        tree.root.right.right.right.right.right.right = new Node(67);

        Node x = tree.root.right.right.right.right.right;
        
        System.out.println("The closest leaf to node with value "
                + x.data + " is at a distance of "
                + closestLeaftoANode.minimumDistance(tree.root, x));
    }
}

