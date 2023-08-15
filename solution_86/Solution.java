package solution_86;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode prefixHead;
    public ListNode prefixTail;

    public ListNode postfixHead;
    public ListNode postfixTail;

    public ListNode partition(ListNode head, int x) {
        ListNode iterationHead = head;

        while (iterationHead != null) {
            ListNode newNode = new ListNode(iterationHead.val, null);

            if (newNode.val >= x) {
                if (this.postfixHead == null) {
                    this.postfixHead = newNode;
                    this.postfixTail = newNode;
                } else {
                    this.postfixTail.next = newNode;
                    this.postfixTail = newNode;
                }
            } else {
                 if (this.prefixHead == null) {
                     this.prefixHead = newNode;
                     this.prefixTail = newNode;
                } else {
                   this.prefixTail.next = newNode;
                   this.prefixTail = newNode;
                }
            }

            iterationHead = iterationHead.next;
        }

        if (this.prefixTail == null) {
             return this.postfixHead;
         }

         if (this.postfixHead == null) {
            return this.prefixHead;
         }

        this.prefixTail.next = this.postfixHead;

        return this.prefixHead;
    }
}