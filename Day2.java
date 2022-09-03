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
import java.util.*;
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans= new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size()>0){
            int n = queue.size();
            double sum = 0;
            for(int i = 0;i<n;i++){
                TreeNode node = queue.peek();
                if(node.left!= null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                
                queue.remove();
                sum += node.val;
            }
            ans.add(sum/n);
        }
        return ans;
    }
}