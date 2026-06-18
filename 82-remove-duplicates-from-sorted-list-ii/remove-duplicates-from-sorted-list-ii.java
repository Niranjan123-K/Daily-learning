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
      

        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp=dummy;
        ListNode cur = head;
        while(cur!=null && cur.next!=null){
            if(cur.val==cur.next.val){
                 while(cur.next!=null && cur.next.val==cur.val){
                    cur=cur.next;
                 }
                 temp.next=cur.next;
                 cur=cur.next;
            }
            else{
                cur=cur.next;
                temp=temp.next;
            }
      
        }
        return dummy.next;
    }
}