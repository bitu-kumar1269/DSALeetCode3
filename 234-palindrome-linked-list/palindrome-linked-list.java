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
    public ListNode reverseLL(ListNode head){
        ListNode curr = head;
        ListNode prev = null, after;

        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        //find middle node of LinkedList
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHead = reverseLL(slow);
        ListNode firstHead = head;

        //compare the reverse node and real node
        boolean result = true;
        while(secondHead != null){
            if(firstHead.val != secondHead.val){
                result = false;
                break;
            }
            firstHead = firstHead.next;
            secondHead = secondHead.next;
        }
        return result;
    }
}