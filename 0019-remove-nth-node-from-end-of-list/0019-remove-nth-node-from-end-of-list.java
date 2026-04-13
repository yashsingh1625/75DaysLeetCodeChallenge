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
        ListNode dmy = new ListNode(0);
        dmy.next = head;
        ListNode fst = dmy;
        ListNode slw = dmy;
        for(int i =0; i<n+1;i++){
            fst = fst.next;
        }
        while(fst!=null){
            fst = fst.next;
            slw = slw.next;
        }
        slw.next = slw.next.next;
        return dmy.next;
    }
}