package LinkedList;
/**
 * Date 04/07/2020
 * @author Biswajit Mahato
 *
 * Insert a node in the given sorted linked list
 *
 * Objective: Given a linked list in which nodes are sorted in ascending order. Write an algorithm to insert a given
 *            node into the linked list so that all the nodes in the list will maintain the sorted order.
 */
public class InsertNodeInSortedList {

    // Node Class
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insertNode(Node head, Node node){

        System.out.print("Given Linked List: ");
        display(head);
        System.out.println(", Insert node: " + node.data);
        head = insertNodeUtil(head, node);
        System.out.print("New List: ");
        display(head);
        System.out.println("\n-----------------------------------------");

    }

    private Node insertNodeUtil(Node head, Node node) {

        if(head == null) {
            head = node;
        } else if(head.data >= node.data){
            node.next = head;
            head = node;
        } else{
            Node current = head;
            while(current.next != null && current.next.data < node.data){
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        return head;

    }

    private void display(Node head) {

        if(head == null){
            System.out.print("Linked list is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(" -> " + currNode.data);
            currNode = currNode.next;
        }

    }

    public static void main(String[] args) {
        InsertNodeInSortedList i = new InsertNodeInSortedList();
        Node head = null;
        Node node = new Node(5);
        i.insertNode(head, node);

        Node head1 = new Node(7);
        Node node1 = new Node(4);
        i.insertNode(head1, node1);

        Node head2 = new Node(2);
        Node node2 = new Node(6);
        i.insertNode(head2, node2);

        Node head3 = new Node(1);
        head3.next = new Node(2);
        head3.next.next = new Node(4);
        head3.next.next.next = new Node(6);
        head3.next.next.next.next = new Node(10);
        Node node3 = new Node(5);
        i.insertNode(head3, node3);

        Node node4 = new Node(50);
        i.insertNode(head3, node4);
    }


}


