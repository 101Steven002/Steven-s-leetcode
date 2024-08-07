/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 找出字符串中第一个匹配项的下标
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        int k = -1;
        for (int i = 0; i < haystack.length(); i++) 
        {
            if (haystack.charAt(i) == needle.charAt(0))
            {
                k = i;
                for (int j = 1; j < needle.length(); j++)
                {
                    if (i + j >= haystack.length() || haystack.charAt(i + j) != needle.charAt(j))
                    {
                        k = -1;
                        break;
                    }
                }
                if (k != -1)
                {
                    break;
                }
            }
        }

        return k;
    }
}
// @lc code=end

