/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        // If main tree becomes empty, subRoot cannot be found
        if (root == null) {
            return false;
        }

        // Check if current subtree is identical
        if (isSame(root, subRoot)) {
            return true;
        }

        // Otherwise search in left OR right subtree
        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }

    // Checks if two trees are exactly the same
    public boolean isSame(TreeNode p, TreeNode q) {

        // Both are null
        if (p == null && q == null) {
            return true;
        }

        // One is null
        if (p == null || q == null) {
            return false;
        }

        // Values are different
        if (p.val != q.val) {
            return false;
        }

        // Compare left and right subtrees
        return isSame(p.left, q.left) &&
               isSame(p.right, q.right);
    }
}