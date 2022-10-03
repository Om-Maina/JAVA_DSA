package cnDSA.trees;

import java.util.ArrayList;

public class TreeNode<T> {
    public T data;
    TreeNode<T> left;
    TreeNode<T> right;
    public ArrayList<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
        children = new ArrayList<>();
    }
}
