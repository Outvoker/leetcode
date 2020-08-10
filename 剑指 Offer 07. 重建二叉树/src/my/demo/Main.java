package my.demo;

import java.awt.desktop.AppReopenedEvent;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void print(TreeNode t) {
        System.out.println(t.val);
        if(t.left != null) print(t.left);
        if(t.right != null) print(t.right);
        return;
    }

    public static int index(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) return i;
        }
        return -1;
    }

    public static TreeNode build(int[] preorder, int[] inorder, int p1, int p2, int i1, int i2) {

//        System.out.println(p1 + "," + p2);
//        System.out.println(i1 + "," + i2);
//        System.out.println("root:" + p1);
//        System.out.println(preorder[p1] + "," + preorder[p2]);
//        System.out.println(inorder[i1] + "," + inorder[i2]);
//        System.out.println("root:" + preorder[p1]);

        if(p1 <= p2 && p2 < preorder.length && i1 <= i2 && i2 < inorder.length) {
            TreeNode t = new TreeNode(preorder[p1]);
            if(p1 == p2) return t;
            int id = index(inorder, preorder[p1]);
            t.left = build(preorder, inorder, p1 + 1, p1 + id - i1, i1, id - 1);
            t.right = build(preorder, inorder, p1 + id - i1 + 1, p2, id + 1, i2);
            return t;
        }
        return null;
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    public static void main(String[] args) {
        int[] preorder = {1, 2};
        int[] inorder = {2, 1};
//        buildTree(preorder, inorder);
        print(buildTree(preorder, inorder));
//        TreeNode t = new TreeNode(3);
//        t.left = new TreeNode(9);
//        t.right = new TreeNode(20);
//        t.right.left = new TreeNode(15);
//        t.right.right = new TreeNode(7);
//        print(t);
    }
}
