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
    public int sizeOfList(ListNode head){
        int size = 0;
        while(head != null){
            head = head.next;
            size++;
        }
        return size/2;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode temp = head;
        int size = sizeOfList(head);
        for(int i=0; i<size-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}