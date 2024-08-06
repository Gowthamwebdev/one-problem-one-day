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

        if(k == 0 || head == null){
            return head;
        }
        
        ListNode curr = head;
        int c = 1;

        while(curr.next != null){
            c++;
            curr = curr.next;
        }
        k = (k%c);
        c = c - k;
        curr.next = head;
        curr = head;

        ListNode temp = null;

        for(int i = 0; i < c; i++){
            if(i == c-1){
                temp = curr.next;
                curr.next = null;
                head = temp;
            }
            curr = curr.next;
        }
       
        return head;
    }
}
