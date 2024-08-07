/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
public class TreeNode {
     int val;
     TreeNode left;
    TreeNode right;
     TreeNode() {}
    TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
  }
 */
class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
     }
}
class Solution {
    class data
    {
        TreeNode node;
        boolean leftVisited;//左子树是否访问完毕
        data(TreeNode node, boolean leftVisited)
        {
            this.node = node;
            this.leftVisited = leftVisited;
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<data> stack = new Stack<>();
        do 
        {
            while (root != null) 
            {
                data temp = new data(root,false);
                stack.push(temp);
                root = root.left;
            }
            while (!stack.isEmpty()&&stack.peek().leftVisited==true)
            {
                result.add(stack.pop().node.val);
            }
            if (!stack.isEmpty())
            {
                stack.peek().leftVisited = true;
                root = stack.peek().node.right;
            }
        } while (!stack.isEmpty());
        return result;
    }   
}
// @lc code=end

