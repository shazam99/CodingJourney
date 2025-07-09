package LinkedList;

import LinkedList.Helper.ListNode;

public class ReverseLinkedListII {
    // 92. Reverse Linked List II
    public static void main(String[] args){
        
        ListNode.printList(ListNode.instance);
        ListNode.printList(reverseBetween(ListNode.instance, 2, 4));
    }
    
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prevL = null;
        ListNode l = null;
        ListNode r = null;
        ListNode nextR = null;

        return null;
    }
}
