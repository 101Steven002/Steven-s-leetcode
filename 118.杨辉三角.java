/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) return triangle;
        triangle.add(Arrays.asList(1));
        if (numRows == 1) return triangle;
        for (int i = 2; i <= numRows; i++)
        {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i - 1; j++)
            {
                row.add(triangle.get(i - 2).get(j - 1) + triangle.get(i - 2).get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
// @lc code=end

