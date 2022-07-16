package LinkedList;
/**
 * Date 02/10/2020
 * @author Biswajit Mahato
 *
 * Implementation of a Reverse linked list
 *
 */
public class ReverseLinkedList {

    public static Node head = null;
    // Node Class
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public  void insertNode(Node head, Node node){

        System.out.print("Given Linked List: ");
        display(head);
        System.out.println(", Insert node: " + node.data);
        head = insertNodeUtil(head, node);
        System.out.print("New List: ");
        display(head);
        System.out.println("\n-----------------------------------------");
        Node reversedHead = reverseLinkedList(head);
        System.out.println(" Reverse Lisnked List:");
        display(reversedHead);
        System.out.println("\n****************************************************");

    }

    // Insert node in the Linked List
    private Node insertNodeUtil(Node head, Node node) {

        if (head == null){

            head = node;

        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            node.next = current.next;
            current.next = node;

        }

        return head;

    }

    // Display the nodes in the Linked List
    private void display(Node head) {

        if (head == null){
            System.out.println("Linked List is empty !");
        }
       Node currNode = head;
        while (currNode != null) {
            System.out.print(" -> " + currNode.data);
            currNode = currNode.next;
        }

    }

    // Reverse Linked List Function
    private Node reverseLinkedList(Node current) {

        // Checking the head of the list
        if (current == null){
            return null;
        }
        //
        if(current.next==null){
            head = current;
            return null;
        }
        //
        reverseLinkedList(current.next);
        current.next.next = current;
        current.next = null;

        return head;
    }

    public static void main(String[] args) {
        ReverseLinkedList i = new ReverseLinkedList();

        Node head3 = new Node(1);
        head3.next = new Node(2);
        head3.next.next = new Node(4);
        head3.next.next.next = new Node(6);
        head3.next.next.next.next = new Node(10);
        Node node3 = new Node(5);
        i.insertNode(head3, node3);
        i.reverseLinkedList(head3);
    }

}
