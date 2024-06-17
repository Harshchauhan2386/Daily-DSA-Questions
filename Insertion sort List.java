// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class Solution {
    public ListNode insertionSortList(ListNode head) {
        // Return the list if it is empty or contains only one node
        if (head == null || head.next == null) {
            return head;
        }

        ListNode sortedTail = head; // The last node in the sorted part of the list
        ListNode current = head.next; // The first node in the unsorted part of the list

        // Ensure the sorted part is initially terminated
        sortedTail.next = null;

        while (current != null) {
            ListNode nextNode = current.next; // Store the next node

            // If the current node should be placed at the end of the sorted list
            if (current.val >= sortedTail.val) {
                sortedTail.next = current;
                sortedTail = current;
                sortedTail.next = null; // Terminate the sorted part
            } else {
                // Find the correct position for the current node in the sorted part
                if (current.val <= head.val) {
                    // Insert current at the head of the list
                    current.next = head;
                    head = current;
                } else {
                    ListNode prev = null;
                    ListNode temp = head;

                    // Find the position to insert the current node
                    while (temp != null && temp.val < current.val) {
                        prev = temp;
                        temp = temp.next;
                    }

                    // Insert current between prev and temp
                    prev.next = current;
                    current.next = temp;
                }
            }

            // Move to the next node in the unsorted part
            current = nextNode;
        }

        return head;
    }
}
