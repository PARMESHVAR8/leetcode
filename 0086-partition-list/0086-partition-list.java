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
    public ListNode partition(ListNode head, int x) {
        ListNode lessdummy = new ListNode(0);
        ListNode greaterdummy = new ListNode(0);
        ListNode lesstail = lessdummy;
        ListNode greatertail = greaterdummy;
        ListNode current = head;
        while(current != null){
            if(current.val < x){
                lesstail.next = current;
                lesstail = current;
            }else{
                greatertail.next= current;
                greatertail = current;
            }
            current = current.next;
        }
        greatertail.next = null;
        lesstail.next = greaterdummy.next;
        return lessdummy.next;
    }
}