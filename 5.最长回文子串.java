/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) 
    {
        if (s == null || s.length() <= 1) {
            return s;
        }
        int n = s.length();

        int maxLength = 1;
        int start = 0;
        

        
        return s.substring(start, start + maxLength);
    }
}
// @lc code=end

