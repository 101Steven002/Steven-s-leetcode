/*
 * @lc app=leetcode.cn id=19 lang=c
 *
 * [19] 删除链表的倒数第 N 个结点
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) 
{
    struct ListNode *fast = head, *slow = head,*pre;
    int num = 0;
    while (fast!= NULL) 
    {
        fast = fast->next;
        num++;
        if (num > n)
        {
            pre = slow;
            slow = slow->next;
        }
    }
    if (slow != NULL)
    {
        pre->next = slow->next;
        free(slow);
    }
    if (n == num)
    {
        free(head);
        head = NULL;
    }
    return head;
}
// @lc code=end

