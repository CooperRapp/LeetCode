import java.awt.*;

public class RemoveDuplicatesFromSortedList extends ListNode {
    public static void main (String [] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        head = deleteDuplicates(head);

        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode headd = head;

        if(headd == null || headd.next == null) return head;

        while(headd.next != null) {
            if(headd.val == headd.next.val) {
                headd.next = headd.next.next;
            }  headd = headd.next;

        }
        return head;
    }
}
