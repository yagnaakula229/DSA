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
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> ls = new ArrayList<>();
       ;
        while(head!=null){
            ls.add(head.val);
            head=head.next;

        }
        Collections.reverse(ls);

        ListNode dummy = new ListNode(0);
        ListNode newHead = dummy;
        for(int val:ls){
            newHead.next=new ListNode(val);
            newHead=newHead.next;
        }

        return dummy.next;
        
    }
}