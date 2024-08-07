/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        int i,j,k;
        List<List<Integer>> result = new ArrayList<>();
        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                for(k=j+1;k<nums.length;k++)
                {
                    if(i!=j && i!=k && j!=k)
                    {
                        if(nums[i]+nums[j]+nums[k]==0)
                        {
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            result.add(list);
                        }
                    }
                }
            }
        }
        return result;
    }
}
// @lc code=end

