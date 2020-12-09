class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

public class lc_1022 {
    /**
     * 涉及到tree数据结构，首先考虑递归算法
     */
    public int sumRootToLeaf(TreeNode root) {
        return getSum(root,0);
    }
    int getSum(TreeNode root, int ans) {
        int sum = 0;
        ans = (ans << 1) + root.val;
        if (root.left == null && root.right == null) return ans;
        if (root.left != null) sum +=getSum(root.left,ans);
        if (root.right != null) sum += getSum(root.right, ans);
        return sum;

    }
}
