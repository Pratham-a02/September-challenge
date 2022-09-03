
// //  * Definition for a binary tree node.
//   public class TreeNode {
//      int val;
//      TreeNode left;
//       TreeNode right;
//       TreeNode() {}
//       TreeNode(int val) { this.val = val; }
//       TreeNode(int val, TreeNode left, TreeNode right) {
//           this.val = val;
//           this.left = left;
//           this.right = right;
//       }

 
class Solution {
    public int goodNodes(TreeNode root) {
        if(root.left == null && root.right == null){
            return 1;
        }
        
        int ans = 0;
        ans += search(root.left,root.val);
        ans += search(root.right,root.val);
        return ans+1;
    }
    
    public int search(TreeNode currNode,int max){
        if(currNode == null) return 0;
        int count = 0;
        if(currNode.val>= max){
            count+=1;
            max = currNode.val;
        }
        count += search(currNode.left,max);
        count += search(currNode.right,max);
        
        return count;
    }
  }
