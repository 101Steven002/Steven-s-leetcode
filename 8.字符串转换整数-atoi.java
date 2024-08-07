/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) 
    {
        int n = s.length();
        int sign = 1, i = 0, res = 0;
        
        // Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ')
            i++;
        
        // Check sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-'))
        {
            sign = s.charAt(i) == '+' ? 1 : -1;
            i++;
        }
        
        // Convert digits to integer
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9')
        {
            int digit = s.charAt(i) - '0';
            // Check for overflow
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > 7))
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + digit;
            i++;
        }
        
        return res*sign;        

    }
}
// @lc code=end

