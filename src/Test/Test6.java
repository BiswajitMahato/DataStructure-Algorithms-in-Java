package Test;

public class Test6 {

    Node head;

    class Node{
        int data;
        Node next;
        Node(){
            this.data = data;
            next = null;
        }
    }


    // 7 -> 4 -> 6 -> 2->9
    //
    public static void reverseLinkedList(Node head){

        Node slow;
        Node fast;

        if(head == null){

            return;
        }

        slow = head;
        fast = head;
        while(slow.next != null) {

            if (slow.next != null) {
                slow = slow.next;
                fast = fast.next;
                if (slow.next != null) {
                    fast = fast.next;

                }
            }
        }

    }

}
