/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) 
    {
        StringBuilder[] rows = new StringBuilder[s.length()];
        for (int i = 0; i < s.length(); i++) {
            rows[i] = new StringBuilder();
        }
        int row = 0, direction = -1;
        for (char c : s.toCharArray()) {
            rows[row].append(c);
            if (row == 0 || row == numRows - 1) {
                direction = -direction;
            }
            row += direction;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder rowBuilder : rows) {
            result.append(rowBuilder);
        }
        return result.toString();
    }
}
// @lc code=end

