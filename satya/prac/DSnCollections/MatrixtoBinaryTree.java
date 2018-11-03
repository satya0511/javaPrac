package satya.prac.DSnCollections;
import java.util.ArrayList;

//import java.util.HashMap;

import java.util.TreeMap;

//import java.util.TreeSet;

public class MatrixtoBinaryTree {


	static int ancestor[][] = new int[][]{

	{0, 0 , 0 , 0 , 0, 0} ,

	{1 , 0, 0, 0, 1, 0},

	{0 , 0, 0, 1, 0, 0},

	{0 ,0, 0, 0, 0, 0},

	{0, 0,0, 0, 0, 0},

	{1, 1, 1, 1, 1, 0 }

	};

	static final int ROW = 6;

	static final int COL = 6;

	public static void main(String args[])	{

	TreeNode treeMap[] = new TreeNode[6];

	boolean parent[] = new boolean[6];

	TreeNode root = null;

	TreeMap<Integer, ArrayList<Integer>> count = new TreeMap<Integer ,ArrayList<Integer>>();

	/*for ( int i = 0 ; i < ROW ; i++)	{

	count.put(i, 0);

	}*/

	for ( int i = 0 ; i < ROW ; i++)	{

	int sum = 0 ;

	for ( int j = 0 ; j < COL ; j++)	{

	//root = buildTree( i , j , root , treeMap);

	if (ancestor[i][j] == 1)	{

	sum = sum + ancestor[i][j];

	}

	}

	if (count.containsKey(sum))	{

	ArrayList<Integer> list = count.get(sum);

	list.add(i);

	}

	else	{

	count.put(sum, new ArrayList<Integer>());

	count.get(sum).add(i);

	}

	}

	for ( int key : count.keySet()){

	ArrayList<Integer> list = count.get(key);

	for ( int TreeNode : list)	{

	root = buildTree( TreeNode , root , treeMap , parent);

	}

	}

	inOrderTraversal(root);

	}

	private static TreeNode buildTree( int TreeNode , TreeNode root , TreeNode[] treeMap , boolean[] parent) {

	// TODO Auto-generated method stub

	root = new TreeNode(TreeNode);

	treeMap[TreeNode] = root;

	for ( int i = 0 ; i < 6 ; i++)	{

	if (ancestor[TreeNode][i] == 1 && !parent[i])	{

	if (treeMap[TreeNode].getLeft() == null)	{

	treeMap[TreeNode].setLeft(treeMap[i]);

	parent[i] = true;

	}

	else if (treeMap[TreeNode].getRight() == null)	{

	treeMap[TreeNode].setRight(treeMap[i]);

	parent[i] = true;

	}

	}

	}

	return root;

	}

	private static void inOrderTraversal(TreeNode root)	{

	if (root == null)	{

	return;

	}

	else	{

	if (root.getLeft() != null)

	inOrderTraversal(root.getLeft());

	System.out.print(root.getValue() + " ");

	if (root.getRight() != null)

	inOrderTraversal(root.getRight());

	}

	}

	}
	
	
