package LinkedList.Helper;

public class ListNode {

    public static ListNode instance = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
    public int val;
    public ListNode next;

    private ListNode(int val) {
        this.val = val;
    }

    private ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void printList(ListNode a) {
        ListNode current = a; // Start with the current node
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next; // Move to the next node
        }
        System.out.println("null"); // End of the list
    }

}

