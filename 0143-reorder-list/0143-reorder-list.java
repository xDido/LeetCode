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
    public void reorderList(ListNode head) {
                while (head != null) {
            ListNode temp = head;
            while (temp.next != null && temp.next.next != null) {
                temp = temp.next;
            }
            if (temp.next != null) {
                ListNode last = temp.next;
                temp.next = null;
                last.next = head.next;
                head.next = last;
                head = head.next.next;
            } else {
                head = head.next;
            }
        }
        
    }
}