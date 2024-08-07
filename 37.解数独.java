/*
 * @lc app=leetcode.cn id=37 lang=java
 *
 * [37] 解数独
 */

// @lc code=start
class Solution {
    public void solveSudoku(char[][] board) 
    {
       int[] row = new int[9];
       int[] col = new int[9];
       boolean[][][] box = new boolean[3][3][9];
       
       // Initialize arrays
       for (int i = 0; i < 9; i++) {
           for (int j = 0; j < 9; j++) {
               if (board[i][j]!= '.') {
                   int num = board[i][j] - '1';
                   int boxIndex = (i / 3) * 3 + j / 3;
                   row[i] |= (1 << num);
                   col[j] |= (1 << num);
                   box[boxIndex][j % 3][num] = true;
               }
           }
       }
       
    }
}
// @lc code=end

