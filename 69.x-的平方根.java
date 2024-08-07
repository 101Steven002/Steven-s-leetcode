/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根 
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) 
    {
        if (x == 0) return 0;
        double x_0 = x ;
        while (true) 
        {
            double x_1 = (x_0 + x / x_0) / 2;
            if (Math.abs(x_1 - x_0) < 1e-7) break;
            x_0 = x_1;  
        }  
        return (int)x_0;
    }
}
// @lc code=end

