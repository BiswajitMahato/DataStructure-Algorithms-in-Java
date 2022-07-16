package LinkedList;

import java.util.List;
import java.util.Stack;

/**
* @Date : 30/11/2021
* @author : Biswajit Mahato
*
* Problem Statement : Add Two Numbers
*
* Link : https://leetcode.com/problems/add-two-numbers/
*
* Input: l1 = [2,4,3], l2 = [5,6,4]
* Output: [7,0,8]
* Explanation: 342 + 465 = 807.
*
* */
public class AddTwoNumbers {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        ListNode resultHead = null;
        ListNode tmp = resultHead;
        while(l1 != null){

            stack1.add(l1.val);
            l1 = l1.next;

        }
        while(l2 != null){

            stack2.add(l2.val);
            l2 = l2.next;

        }
        int num1 = 0,num2 = 0;
        for (int i = 0; i < stack1.capacity(); i++) {
            num1 = num1*10 + stack1.peek();
            stack1.pop();
        }
        for (int i = 0; i < stack2.capacity(); i++) {
            num2 = num2*10 + stack2.peek();
            stack2.pop();
        }

        System.out.println("Stack 1 :"+stack1);
        System.out.println("Stack 2 :"+stack2);
        int total = num1 + num2;
        Stack<Integer> result = new Stack<>();
        while( total != 0){
            int rem = total % 10;
            result.add(rem);
            total = total/10;
        }

        for (int i = 0; i <result.capacity(); i++) {
            tmp.val = result.peek();
            result.pop();
            tmp = tmp.next;
        }
        
        return  resultHead;
    }

    public static void main(String[] args) {

        AddTwoNumbers obj = new AddTwoNumbers();
        ListNode list1 = new ListNode();
        list1.val = 5;
        list1 = list1.next;
        list1.val = 6;
        list1 = list1.next;
        list1.val = 4;

        ListNode list2 = new ListNode();
        list2.val = 7;
        list2 = list2.next;
        list2.val = 0;
        list2 = list2.next;
        list2.val = 8;

        obj.addTwoNumbers(list1,list2);
    }
}
