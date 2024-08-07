/*
 * @lc app=leetcode.cn id=21 lang=c
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
//  struct ListNode {
//     int val;
//     struct ListNode *next;
// };
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    // if (!list1) return list2;
    // if (!list2) return list1;
    
    // struct ListNode* dummy = (struct ListNode*)malloc(sizeof(struct ListNode));
    // dummy->next = NULL;
    // struct ListNode* cur = dummy;
    
    // while (list1 && list2) {
    //     if (list1->val <= list2->val) {
    //         cur->next = list1;
    //         list1 = list1->next;
    //     } else {
    //         cur->next = list2;
    //         list2 = list2->next;
    //     }
    //     cur = cur->next;
    
    // }
    
    // if (list1) cur->next = list1;
    // if (list2) cur->next = list2;
    
    // return dummy->next;
    
}
// @lc code=end

