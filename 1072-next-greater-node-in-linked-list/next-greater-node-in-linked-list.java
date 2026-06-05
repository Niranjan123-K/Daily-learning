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
    public int[] nextLargerNodes(ListNode head) {
          int count = 0;
          ListNode cur = head;
          while(cur!=null){
            count++;
            cur=cur.next;
          }
          int[] ans = new int[count];
          int in = 0;
          ListNode temp1 = head;
          ListNode temp2 = head;
          while(temp1!=null){
            int data = temp1.val;
            int find = 0;
            while(temp2!=null){
                if(temp2.val > data){
                    find = 1;
                   ans[in++]=temp2.val;
                   break;
                }
                temp2=temp2.next;
            }
            if(find==0){
                ans[in++]=0;
            }
            
            temp1=temp1.next;
            temp2=temp1;
          }
          return ans;
    }
}