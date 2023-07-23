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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode now = head;
        while (now != null && now.next != null){
            if (now.next.val == now.val){
                now.next = now.next.next;
            } else {
                now = now.next;
            }
        }
        return head;
    }
}