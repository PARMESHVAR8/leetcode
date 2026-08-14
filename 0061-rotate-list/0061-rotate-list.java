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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k==0){
            return head;
        }
        ListNode dummy = head;
        int len =1;
        while(dummy.next != null){
            dummy = dummy.next;
            len++;
        }
        dummy.next = head;
        k = k% len;
        for(int i =0; i< len-k; i++){
            dummy = dummy.next;
        }
        head = dummy.next;
        dummy.next = null;
        return head;
    }
}