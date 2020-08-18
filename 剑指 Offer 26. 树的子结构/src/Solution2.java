public class Solution2 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSub(TreeNode A, TreeNode B) {
        if(B == null) return true;
        else if(A == null || A.val != B.val) return false;
        else {
            return (isSub(A.left, B.left) && isSub(A.right, B.right));
        }

    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
            return (A != null && B != null) && (isSub(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }
}
