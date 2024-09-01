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
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode();
        ListNode ptr = dummy;
        
        // Traverse the list
        while (head != null) {
            // If the current node's value is not equal to val, link it to ptr
            if (head.val != val) {
                ptr.next = head;
                ptr = ptr.next;
            }
            // If the current node's value is equal to val and it's the last node,
            // ensure ptr.next is set to null
            if (head.next == null && head.val == val) {
                ptr.next = null;
            }
            // Move to the next node
            head = head.next;
        }
        
        // Return the new head of the list
        return dummy.next;
    }
}
