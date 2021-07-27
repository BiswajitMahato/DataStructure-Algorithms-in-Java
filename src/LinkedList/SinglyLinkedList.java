package LinkedList;
/**
 * Date 04/17/2020
 * @author Biswajit Mahato
 *
 * Implementation of a singly linked list
 *
 */

class Node<T> implements Comparable<T> {

    private T value;
    private Node<T> nextRef;

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public Node<T> getNextRef() {
        return nextRef;
    }
    public void setNextRef(Node<T> ref) {
        this.nextRef = ref;
    }
    @Override
    public int compareTo(T arg) {
        if(arg == this.value){
            return 0;
        } else {
            return 1;
        }
    }
}
public class SinglyLinkedList<T> {

        private Node<T> head;
        private Node<T> tail;

        public void add(T element){

            Node<T> node = new Node<T>();
            node.setValue(element);
            System.out.println("Adding: "+element);

            if(head == null){
            //since there is only one element, both head and tail points to the same object
                head = node;
                tail = node;

            }
            else {

                //set current tail next link to new node
                tail.setNextRef(node);
                //set tail as newly created node
                tail = node;

            }

        }

        public void addAfter(T element, T after){

            Node<T> tmp = head;
            Node<T> refNode = null;
            System.out.println("Traversing to all nodes..");
            /**
             * Traverse till given element
             */
            while(true){
                if(tmp == null){
                    break;
                }
                if(tmp.compareTo(after) == 0){
                    //found the target node, add after this node
                    refNode = tmp;
                    break;
                }
                tmp = tmp.getNextRef();
            }
            if(refNode != null){
                //add element after the target node
                Node<T> nd = new Node<T>();
                nd.setValue(element);
                nd.setNextRef(tmp.getNextRef());
                if(tmp == tail){
                    tail = nd;
                }
                tmp.setNextRef(nd);

            } else {
                System.out.println("Unable to find the given element...");
            }

        }
        public void deleteFront(){

            if(head == null){
                System.out.println("Underflow...");
            }
            Node<T> tmp = head;
            head = tmp.getNextRef();
            if(head == null){
                tail = null;
            }
            System.out.println("Deleted: "+tmp.getValue());
        }


    public void deleteAfter(T after){

        Node<T> tmp = head;
        Node<T> refNode = null;
        System.out.println("Traversing to all nodes..");
        /**
         * Traverse till given element
         */
        while(true){
            if(tmp == null){
                break;
            }
            if(tmp.compareTo(after) == 0){
                //found the target node, add after this node
                refNode = tmp;
                break;
            }
            tmp = tmp.getNextRef();
        }
        if(refNode != null){
            tmp = refNode.getNextRef();
            refNode.setNextRef(tmp.getNextRef());
            if(refNode.getNextRef() == null){
                tail = refNode;
            }
            System.out.println("Deleted: "+tmp.getValue());
        } else {
            System.out.println("Unable to find the given element...");
        }
    }

    public void traverse(){

        Node<T> tmp = head;
        while(true){
            if(tmp == null){
                break;
            }
            System.out.println(tmp.getValue());
            tmp = tmp.getNextRef();
        }
    }

    public static void main(String a[]){
        SinglyLinkedList<Integer> sl = new SinglyLinkedList<Integer>();
        sl.add(3);
        sl.add(32);
        sl.add(54);
        sl.add(89);
        sl.addAfter(76, 54);
        sl.deleteFront();
        sl.deleteAfter(76);
        sl.traverse();

    }

}
