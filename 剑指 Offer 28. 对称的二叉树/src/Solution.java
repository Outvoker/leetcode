import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {

    public boolean recur(TreeNode l, TreeNode r) {
        if(l == null & r == null) return true;
        else if(l == null || r == null || l.val != r.val) return false;
        else return recur(l.left, r.right) && recur(l.right, r.left);
    }

    public boolean isSymmetric(TreeNode root) {
        return root == null || recur(root.left, root.right);
    }
}
