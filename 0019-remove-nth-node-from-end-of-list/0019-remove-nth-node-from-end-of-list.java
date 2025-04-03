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
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        } 
        int i=1;
        ListNode temp1=head;
        if(n==len){
            head=head.next;
            return head;
        }
        while(i!=len-n){
            temp1=temp1.next;
            i++;
        }
        temp1.next=temp1.next.next;
        return head;
    }
}