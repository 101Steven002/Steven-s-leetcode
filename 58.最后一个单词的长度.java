/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) 
    {
        int count = 0;
        int length = 0;
        int i = s.length()-1;
        while (true)
        {
            if (s.charAt(i) != ' ') {
                count = 1;
            }
            if (('a'<=s.charAt(i)&&s.charAt(i)<='z') ||'A'<=s.charAt(i)&&s.charAt(i)<='Z')
            {
                length++;
            } 
            i--;
            if (i<0 || (count == 1&&s.charAt(i) == ' '))
            {
                break;
            }
        }
        return length;
    }
}
// @lc code=end

