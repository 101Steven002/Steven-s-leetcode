/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) 
    {
        int i = s.length() - 1, j = 0;
        while (  j < i )
        {
            while ( j < i&& !Character.isLetterOrDigit(s.charAt(i)))
            {
                i--;
            }
            while ( j < i &&!Character.isLetterOrDigit(s.charAt(j)))
            {
                j++;
            }
            if(  j < i )
            {
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                {
                    return false;
                }            
                i--;
                j++;
            }

        }
        return true;
    }
}
// @lc code=end

