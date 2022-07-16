package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * Date : 16/03/2022
 * @author : Biswajit Mahato
 * Problem Statement : Construct a complete binary tree from its linked list representation
 * Given a linked list, construct a complete binary tree from it.
 * Assume that the order of elements present in the linked list is the same as that in the complete tree’s array representation.

 * For a tree node at position i in the linked list, the left child is present at position 2×i,
 * and the right child is present at position 2×i + 1. (Here, position i starts from 1).

 * Link : https://www.geeksforgeeks.org/next-greater-element/

 */
public class CompleteBinaryTreeFromLinkedList {

    // A Binary Tree Node
    static class TreeNode
    {
        int data;
        TreeNode left, right;

        TreeNode(int data)
        {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // A Linked List Node
    static class ListNode
    {
        int data;
        ListNode next;

        ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    // Utility function to create a new node with the given data and
    // pushes it onto the list's front
    public static ListNode push(ListNode head, int data)
    {
        ListNode node = new ListNode(data);
        node.next = head;
        node.data = data;
        return node;
    }

    // Function to perform preorder traversal on a given binary tree.
    public static void preorder(TreeNode root)
    {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Function to construct a complete binary tree from a given linked list
    public static TreeNode convertListToBinaryTree(ListNode head)
    {
        // base case
        if (head == null) {
            return null;
        }

        // create the root using the first node of the linked list
        TreeNode root = new TreeNode(head.data);

        // move the head pointer to the next node
        head = head.next;

        // create a queue to store tree pointers and enqueue the root node
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        // loop till the end of the linked list is reached
        while (head != null)
        {
            // dequeue front node
            TreeNode front = q.poll();

            // create a left child from the next node in the linked list and enqueue it
            front.left = new TreeNode(head.data);
            q.add(front.left);

            // move the head pointer to the next node
            head = head.next;

            // if the linked list did not reach its end
            if (head != null)
            {
                // create the right child from the next node in the linked list and
                // enqueue it
                front.right = new TreeNode(head.data);
                q.add(front.right);

                // move the head pointer to the next node
                head = head.next;
            }
        }

        // return root of the constructed binary tree
        return root;
    }

    public static void main(String[] args)
    {
        ListNode head = null;
        int n = 6;

        // construct a linked list
        for (int i = n; i > 0; i--) {
            head = push(head, i);
        }

        TreeNode root = convertListToBinaryTree(head);
        preorder(root);
    }


}
