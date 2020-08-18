public class Solition {

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
        else if(A == null) return false;
        if(A.val == B.val) {
            return (isSub(A.left, B.left) && isSub(A.right, B.right));
        }
        else return false;

    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B == null) return false;
        else if(A == null) return false;
        else if(A.val == B.val) {
            return (isSub(A.left, B.left) && isSub(A.right, B.right)) || (isSubStructure(A.left, B) || isSubStructure(A.right, B));
        }
        else{
            return (isSubStructure(A.left, B) || isSubStructure(A.right, B));
        }
    }

}
