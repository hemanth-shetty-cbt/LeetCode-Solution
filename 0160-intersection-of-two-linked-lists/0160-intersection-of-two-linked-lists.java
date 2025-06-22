/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashSet<ListNode> st = new HashSet<>();
        ListNode temp = headA;
    

        while(temp != null) {
            st.add(temp);
            temp = temp.next;
        }

        while (headB != null) {
            if(st.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}