public class Solution {

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        //2 pointers to get the middle
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse
        ListNode prev = null;
        ListNode current = slow;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        //Merge
        ListNode firstHalf = head;
        ListNode secondHalf = prev;
        while (secondHalf.next != null) {
            ListNode temp = firstHalf.next;
            firstHalf.next = secondHalf;
            firstHalf = temp;

            temp = secondHalf.next;
            secondHalf.next = firstHalf;
            secondHalf = temp;
        }
    }
}
