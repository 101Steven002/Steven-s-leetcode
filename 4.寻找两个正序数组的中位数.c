/*
 * @lc app=leetcode.cn id=4 lang=c
 *
 * [4] 寻找两个正序数组的中位数
 */

// @lc code=start
 void Merge(int SR1[], int SR2[], int TR[], int m, int n) {
        int i, j, k;
        i = j = k = 0;
        while (i < m && j < n) {
            if (SR1[i] < SR2[j]) TR[k++] = SR1[i++];
            else TR[k++] = SR2[j++];
        }
        while (i < m) TR[k++] = SR1[i++];
        while (j < n) TR[k++] = SR2[j++];
    }

double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int len = nums1Size + nums2Size;
    int mergedArray[len];  
    
    Merge(nums1, nums2, mergedArray, nums1Size, nums2Size);
    
    if (len % 2 == 1) return mergedArray[len/2];
    else return (mergedArray[len/2-1] + mergedArray[len/2]) / 2.0;  // 注意取整
}

// @lc code=end

