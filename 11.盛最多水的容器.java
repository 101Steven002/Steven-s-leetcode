/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) 
    {
        int i = 0, j = height.length - 1;
        int maxarea = 0;
        for (i = 0;i != j; )
        {
            int h = Math.min(height[i], height[j]);
            maxarea = Math.max(maxarea, h * (j - i));
            if (height[i] < height[j])
                i++;
            else
                j--;    
        }
        return maxarea;
    }
}
// @lc code=end

