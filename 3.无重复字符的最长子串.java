/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j,k;
        int len_max = 1;
        int len = 1;
        if (s.isEmpty()) 
        {
            return 0;    
        }
        for (j = i + 1; j < s.length(); j++) 
        {
            len = 1;
            for ( k = i; k < j; k++)
            {
                if (s.charAt(k)!=s.charAt(j)) 
                {
                    len++;
                    if (len > len_max) 
                    {
                        len_max = len;
                    }
                }
                else 
                {
                    i++;
                    j = i;
                    break;
                }
            }
        }
        return len_max;
    }
}
// @lc code=end

