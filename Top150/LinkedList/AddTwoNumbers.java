package Top150.LinkedList;

public class AddTwoNumbers {
    // 2. Add Two Numbers
    public static void main(String[] args){
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(9)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        System.out.println(addTwoNumbers(l1, l2).val);
        System.out.println(addTwoNumbers(l1, l2).next.val);
        System.out.println(addTwoNumbers(l1, l2).next.next.val);
        System.out.println(addTwoNumbers(l1, l2).next.next.next.val);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode currentHead = dummyHead;

        int carry = 0;
        while(l1 != null || l2 != null){
            int x = l1 != null ? l1.val : 0; 
            int y = l2 != null ? l2.val : 0;

            int sum = x+y+carry;
            carry = sum/10;
            currentHead.next = new ListNode(sum%10);
            currentHead = currentHead.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if(carry > 0){
            currentHead.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}