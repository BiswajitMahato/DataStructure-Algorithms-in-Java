package LinkedList;

import java.util.Stack;

/**
 * Date : 29/10/2020
 *
 * @author : Biswajit Mahato
 * <p>
 * 234. Palindrome Linked List : https://leetcode.com/problems/palindrome-linked-list/
 */
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

public class PelindromeLinkedList {

    public ListNode root;

    public static void main(String args[]) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(3);
        ListNode six = new ListNode(2);
        ListNode seven = new ListNode(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        boolean condition = isPalindrome2(one);
        System.out.println("isPalidrome :" + condition);
    }

    // METHOD 1 (Use a Stack)
    public static boolean isPalindrome(ListNode head) {

        Stack<Integer> stack = new Stack<>();
        ListNode headTmp = head;
        while (headTmp != null) {

            stack.push(headTmp.val);
            headTmp = headTmp.next;

        }
        while (head != null) {

            if (head.val == stack.pop()) {
                head = head.next;
            } else {

                return false;
            }
        }

        return true;
    }

    /**
     * 1. Find the median node.
     * 2. Reverse the second half of the list.
     * 3. Start advancing pointers from both ends, check every corresponding nodes have the same value.
     */
    public static boolean isPalindrome2(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head, fast = head, prev, temp;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        prev = slow;
        slow = slow.next;
        prev.next = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        fast = head;
        slow = prev;
        while (slow != null) {
            if (fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;

    }

    /**
     * Approach: Use dual pointer method to get the middle of the linked list. The idea is, have a slow pointer and a fast
     * pointer, and every time move the slow pointer by 1 step, and the fast pointer by 2 steps. By the time the
     * fast pointer reaches the end of the list, the slow pointer will reach the middle of the list.
     * Also, while we're finding the middle, reverse the slow pointer nodes, essentially reversing the first half
     * of the linked list.
     * Now have two pointers at the middle of the linked list pointing to each half. For linked list with even
     * length like [2,4,5,7] these will start at 4 and 5. For odd length lists like [2,4,5,7,8], these will start
     * at 4 and 7, skipping the middle element.
     * Now traverse both the halves and compare the values.
     * P.S. Here we are modifying the list (next nodes) by reversing the first half to have O(1) space complexity.
     * We could restore the list to its original state by again reversing the first half while comparing with second
     * half, if the problem statement asked us to do so.
     * <p>
     * Complexity analysis: Time: O(n), Space: O(1)
     */
    public boolean isPalindrome4(ListNode head) {

        if (head == null || head.next == null) return true;

        // Reverse the first half
        ListNode prevSlowNode = null;
        ListNode slowNode = head;
        ListNode fastNode = head;
        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;                                      //Move fast pointer

            //Reverse
            ListNode nextSlowNode = slowNode.next;                              //Store next node in a variable
            slowNode.next = prevSlowNode;                                       //Point current node to prev node
            prevSlowNode = slowNode;                                            //Move prev node to next (curr) node
            slowNode = nextSlowNode;                                            //Move curr node to next node
        }

        // Find the pointers to the two halves
        ListNode firstHalfPointer = prevSlowNode;                               //Point to prevSlowNode, like like 4 in
        //[2,4,5,7] or [2,4,5,7,8]
        ListNode secondHalfPointer = null;
        if (fastNode == null) {                                                     //List is of even length, like [2,4,5,7]
            secondHalfPointer = slowNode;                                       //Point to slowNode, like 5 in [2,4,5,7]
        } else if (fastNode.next == null) {                                           //List is of odd length, like [2,4,5,7,8]
            secondHalfPointer = slowNode.next;                                  //Point to slowNode.next, like 7 in [2,4,5,7,8]
        }

        //  Compare the two halves

        while (firstHalfPointer != null && secondHalfPointer != null) {
            if (firstHalfPointer.val != secondHalfPointer.val) {
                return false;
            }
            firstHalfPointer = firstHalfPointer.next;
            secondHalfPointer = secondHalfPointer.next;
        }

        return true;
    }

    // Recursive Solutions
    public boolean isPalindrome3(ListNode head) {
        root = head;
        return (head == null) ? true : _isPalindrome(head);
    }

    public boolean _isPalindrome(ListNode head) {
        boolean flag = true;
        if (head.next != null) {
            flag = _isPalindrome(head.next);
        }
        if (flag && root.val == head.val) {
            root = root.next;
            return true;
        }
        return false;
    }

}
