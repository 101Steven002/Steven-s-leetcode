/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution 
{
    public String addBinary(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int i, j, k;
        int lenResult = Math.max(lenA, lenB);
        int carry = 0;
        StringBuilder stringResult = new StringBuilder();
    
        for (k = 0; k < lenResult; k++) {
            i = (lenA - 1 - k >= 0) ? (a.charAt(lenA - 1 - k) - '0') : 0;
            j = (lenB - 1 - k >= 0) ? (b.charAt(lenB - 1 - k) - '0') : 0;
            int sum = carry + i + j;
            stringResult.append(sum % 2);
            carry = sum / 2;
        }
    
        if (carry != 0) {
            stringResult.append(carry);
        }
    
        return stringResult.reverse().toString();
    }
}
// @lc code=end

