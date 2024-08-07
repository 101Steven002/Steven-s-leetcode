/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) 
    {
        int flag = 1;
        int absX = Math.abs(x);
        if (x < 0)  flag = -1; 
        int result = 0;
        while (absX >0) 
        {
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && absX/10 > 7)) return 0;
            result = result*10 + absX%10;
            absX = absX/10;  // 去掉最后一位    
        }
        return flag*result;   
    }
}
// @lc code=end

