/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) 
    {
        boolean result = false;
        Set<Integer> set = new HashSet<>();
        while (!result) 
        {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            if (sum == 1) 
            {
                result = true;
            } 
            else if (set.contains(sum)) 
            {
                result = false;
                break;
            } 
            else 
            {
                set.add(sum);
                n = sum;
            }
        }
        return result;
    }
}
// @lc code=end

