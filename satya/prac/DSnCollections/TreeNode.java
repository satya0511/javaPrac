package satya.prac.DSnCollections;

import java.util.List;

class TreeNode<T> {
    private T value;
    private TreeNode left;
    private TreeNode right;
    public TreeNode() {
        this.value = null;
        this.left = null;
        this.right = null;
    }

    public TreeNode(final T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public TreeNode(final T value, final TreeNode left, final TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public TreeNode getLeft() {
        return this.left;
    }

    public TreeNode getRight() {
        return this.right;
    }

    public void setLeft(final TreeNode left) {
        this.left = left;
    }

    public void setRight(final TreeNode right) {
        this.right = right;
    }

    public T getValue() {
        return this.value;
    }

    public static void addInOrder(final TreeNode root, final List<TreeNode> inOrderList) {
        if (root == null) {
            return;
        }

        addInOrder(root.getLeft(), inOrderList);
        inOrderList.add(root);
        addInOrder(root.getRight(), inOrderList);
    }
    
}