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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fastNode = head, slowNode = head;
        int count = 1;

        while (count <= n) {
            fastNode = fastNode.next;
            count ++;
        }

        if(fastNode == null) {
            return head.next;
        }

        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }

       ListNode delNode = slowNode.next;
       slowNode.next = slowNode.next.next;
       delNode = null;

       return head;        
        
    }
}