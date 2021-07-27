package Leetcode_Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Date : 20/10/2020
 * @author : Biswajit Mahato
 *
 * 21. Merge Two Sorted Lists : https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergedTwoSortedList {

    /* Definition for singly-linked list. */
    public static class ListNode {
        int value;
        ListNode nextRef;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public ListNode getNextRef() {
            return nextRef;
        }

        public void setNextRef(ListNode nextRef) {
            this.nextRef = nextRef;
        }

        ListNode() {}
        ListNode(int val) {
              this.value = val;
        }
        ListNode(int val, ListNode next)
        {
              this.value = val;
              this.nextRef = next;
        }
    }


    static String N;
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        N = br.readLine();

       // System.out.println(" The String is :" + mergeTwoLists());

    }
    public static ListNode head;
    public static ListNode tail;
    public static void insertLinkedList(int element){

        ListNode node = new ListNode();
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



   // public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {





    }



