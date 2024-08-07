/*
 * @lc app=leetcode.cn id=83 lang=c
 *
 * [83] 删除排序链表中的重复元素
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head)   
{  
    if (head == NULL || head->next == NULL) return head;  
      
    struct ListNode *p = head, *q = head->next;  
    while (q != NULL)  
    {  
        if (p->val == q->val)  
        {  
            p->next = q->next;  
            free(q);  
            q = p->next;  
        }  
        else  
        {  
            p = p->next;  
            q = q->next;  
        }  
    }  
    return head;  
}
// @lc code=end

