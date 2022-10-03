package cnDSA.trees;

import java.util.Scanner;

public class TreeUseingRecursion {
    public static void preorder(TreeNode<Integer> root) {
       if (root == null){
           return;
       }
        System.out.println(root.data + " ");
        for (int i = 0; i < root.children.size(); i++) {
            preorder(root.children.get(i));
        }
    }
    public static void postorder(TreeNode<Integer> root){
       if (root == null){
           return;
       }
        for (int i = 0; i < root.children.size(); i++) {
            postorder(root.children.get(i));
            System.out.println(root.data + " ");
        }
    }

    public static int hight(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int smallLeftOutput = hight(root.left);
        int smallrightOutput = hight(root.right);
        if (smallLeftOutput > smallrightOutput) {
            return smallLeftOutput;
        } else {
            return smallrightOutput;
        }
    }

    //public static int leefNode(TreeNode<Integer> root){
//    if (root == null){
//        return 1;
//    }
//    for (int i = 0; i < root.children.size(); i++) {
//     if (root.children.size(i) == null){
//         return 1;
//     }
//    }
//   // if (root.children)
//}
    public static int largest(TreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int ans = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            int childlargest = largest(root.children.get(i));
            if (childlargest > ans) {
                ans = childlargest;
            }
        }
        return ans;
    }

    public static int numNodes(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < root.children.size(); i++) {
            count += numNodes(root.children.get(i));
        }
        return count;
    }

    // tree input and print using recursion.
    public static TreeNode<Integer> takeInput(Scanner scan) {
        int n;

        System.out.println("Enter next node data");
        n = scan.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(n);
        System.out.println("Enter number of children for " + n);
        int childcount = scan.nextInt();
        for (int i = 0; i < childcount; i++) {
            TreeNode<Integer> child = takeInput(scan);
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root) {
        String s = root.data + ":";
        for (int i = 0; i < root.children.size(); i++) {
            s = s + root.children.get(i).data + ",";
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeNode<Integer> root = takeInput(scan);
        print(root);
//        System.out.println(largest(root));
//        System.out.println(numNodes(root));
//        System.out.println(hight(root));
//        preorder(root);
//        System.out.println();
        postorder(root);
        System.out.println();
//        postOrder1(root);
//        System.out.println();

        //        TreeNode<Integer> root = new TreeNode<Integer>(4);
//        TreeNode<Integer> node1 = new TreeNode<Integer>(2);
//        TreeNode<Integer> node2 = new TreeNode<Integer>(3);
//        TreeNode<Integer> node3 = new TreeNode<Integer>(5);
//        TreeNode<Integer> node4 = new TreeNode<Integer>(6);
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//        node2.children.add(node4);
//        System.out.println(root);
    }
}
