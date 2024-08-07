/*
 * @lc app=leetcode.cn id=2 lang=c
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
// #define NULL 0
//  struct ListNode {
//     int val;
//     struct ListNode *next;
// };
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode* head = (struct ListNode*)malloc(sizeof(struct ListNode));
    struct ListNode* result = head;
    int carry = 0;
    while (l1 != NULL|| l2 != NULL ||carry != 0)  
    {
        int val1 = (l1 != NULL) ? l1->val : 0;
        int val2 = (l2 != NULL) ? l2->val : 0;
        int sum = val1 + val2 + carry;
        carry = sum/10;
        sum %= 10;
        result->val = sum;

        if(l1!=NULL) l1 = l1->next;
        if(l2!=NULL) l2= l2->next;

        if (l1 != NULL|| l2 != NULL||carry != 0)
        {
            result->next = (struct ListNode*)malloc(sizeof(struct ListNode));
            result = result->next;
        }
    }
    result->next = NULL;
    return head;
    
}
// @lc code=end

