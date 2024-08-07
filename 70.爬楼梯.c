/*
 * @lc app=leetcode.cn id=70 lang=c
 *
 * [70] 爬楼梯
 */

// @lc code=start
int climbStairs(int n) {
    int kind = 0;
    if (n <= 2) kind = n;
    else {
        int *dp = (int *)malloc(sizeof(int) * (n + 1));
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        kind = dp[n];
        free(dp);
    }
    return kind;    
}
// @lc code=end

