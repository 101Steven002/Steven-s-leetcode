/*
 * @lc app=leetcode.cn id=26 lang=c
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
int removeDuplicates(int* nums, int numsSize) {
    int i = 0;
    int j = 0;
    int k = 1;
    if(numsSize <= 1) return numsSize;
    for ( j = i + 1; j < numsSize ; j++)
    {
        if (nums[j] > nums[i])
        {
            nums[++i] = nums[j];
            k++;
        }    
    }
    return k;
    
}
// @lc code=end

