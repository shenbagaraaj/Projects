public class ListNode{
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
    }

}


class LinkedList{
    public static void main(String[]args){
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        ListNode node4 = new ListNode(25);
        node2.next = node4;

        ListNode dummy = node1;

        while(dummy != null){
            System.out.println(dummy.val);
            dummy = dummy.next;
        }
        System.out.println(node3.val);

    }
}