package my.demo;

import java.util.HashMap;

public class Main2 {
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

    static int[] pre;
    static HashMap<Integer, Integer> map;

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        pre = preorder;
        map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(0, 0, inorder.length - 1);
    }

    public static TreeNode build(int pre_root, int in_left, int in_right) {
        if(in_left > in_right) return null;
        TreeNode t = new TreeNode(pre[pre_root]);
        int index = map.get(pre[pre_root]);
        t.left = build(pre_root + 1, in_left,  index - 1);
        t.right = build(pre_root + index - in_left + 1, index + 1, in_right);
        return t;
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
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
