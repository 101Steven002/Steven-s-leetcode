/*
 * @lc app=leetcode.cn id=100 lang=c
 *
 * [100] 相同的树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool isSameTree(struct TreeNode* p, struct TreeNode* q) 
{
    if (p == NULL && q == NULL) return true;
    if (p == NULL || q == NULL) return false;
    
    if (p->val!= q->val) return false;
    
    return isSameTree(p->left, q->left) && isSameTree(p->right, q->right);  // 左右子树也要相等    
}
// @lc code=end

