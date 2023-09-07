package solutions.solution_92;

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        int valuesLength = right - left + 1;
        int[] values = new int[valuesLength];

        int counter = 1;
        ListNode currentNode = head;
        int valuesIndex = 0;

        while (currentNode != null) {
            if (counter >= left && counter <= right) {
                values[valuesIndex++] = currentNode.val;
            }
            currentNode = currentNode.next;
            counter++;
        }

        currentNode = head;
        counter = 1;
        valuesIndex = valuesLength - 1;
        while (currentNode != null) {
            if (counter >= left && counter <= right) {
                currentNode.val = values[valuesIndex--];
            }
            currentNode = currentNode.next;
            counter++;
        }

        return head;
    }
}