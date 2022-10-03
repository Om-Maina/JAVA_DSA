package cnDSA.bTree;

import java.util.Scanner;

public class Btreeuse {
    public static void printTree(BTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        String toBePrinted = root.data + "";
        if (root.left != null) {
            toBePrinted += "L:" + root.left.data + ",";
        }
        if (root.right != null) {
            toBePrinted += "R:" + root.right.data;
        }
        System.out.println(toBePrinted);
        printTree(root.left);
        printTree(root.right);
    }

    public static BTreeNode<Integer> takeInput(Scanner s) {
        int rootData;
        System.out.println("enter root data");
        rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        BTreeNode<Integer> root = new BTreeNode<Integer>(rootData);
        root.left = takeInput(s);
        root.right = takeInput(s);
        return root;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BTreeNode<Integer> root = takeInput(s);
        printTree(root);
        s.close();
//        BTreeNode<Integer> root = new BTreeNode<>(1);
//        BTreeNode<Integer> node1 = new BTreeNode<>(2);
//        root.left = node1;
//        BTreeNode<Integer> node2 = new BTreeNode<>(3);
//        root.right = node2;
    }

}
