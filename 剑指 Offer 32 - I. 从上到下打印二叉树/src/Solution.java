import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        ArrayList<Integer> res = new ArrayList<>();
        while(!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            res.add(tmp.val);
            if(tmp.left != null) queue.offer(tmp.left);
            if(tmp.right != null) queue.offer(tmp.right);
        }
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }
}
