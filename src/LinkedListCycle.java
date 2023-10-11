import java.util.HashMap;

public class LinkedListCycle {
    public static void main (String [] args) {
        ListNode head = null;
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> nodes = new HashMap<>();

        if(head == null) return false;

        while(head.next != null) {
            if(!nodes.containsKey(head)) {
                nodes.put(head, 1);
            } else {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}
