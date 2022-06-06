/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null; 
        }
        
        int n1 = 0, n2 = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA!=null){
            tempA=tempA.next;
            n1++;
        }
        while(tempB!=null){
            tempB=tempB.next;
            n2++;
        }
        
        for(int i=Math.abs(n1-n2);i>0;i--){
            if(n1>n2){
                headA=headA.next;
            }else{
                headB=headB.next;
            }
        }
        
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
        
    }
}