package Problem2;

public class SortList {
    private static final int SENTRY = Integer.MAX_VALUE;
    // DO NOT ADD ANY NEW MEMBER VARIABLE AND MEMBER FUNCTION

    // DO NOT CHANGE ANYTHING IN THIS FUNCTION
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode mid = findMidAndBreak(head);
        return mergeLists(sortList(head), sortList(mid));
    }

    static ListNode head1, head2;

    public static ListNode findMidAndBreak(ListNode head) {
        // homework
        ListNode p1 = head;
        ListNode p2 = head;

        if (head == null) {
            return null;
        }
        while (p2.next != head
                && p2.next.next != head) {
            p2 = p2.next.next;
            p1 = p1.next;
        }

        if (p2.next.next == head) {
            p2 = p2.next;
        }

        head1 = head;

        if (head.next != head) {
           head2 = p1.next;
        }

        p2.next = p1.next;
        p1.next = head;

        return head;
    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        // homework
        ListNode head = new ListNode(0);
        ListNode p=head;

        ListNode p1=list1;
        ListNode p2=list2;
        while(p1!=null && p2!=null){
            if(p1.val < p2.val){
                p.next = p1;
                p1 = p1.next;
            }else{
                p.next = p2;
                p2 = p2.next;
            }
            p=p.next;
        }

        if(p1!=null){
            p.next = p1;
        }

        if(p2!=null){
            p.next = p2;
        }

        return head.next;
    }
}
