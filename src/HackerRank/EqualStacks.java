package HackerRank;

import java.util.Stack;

/**
 * Date 16/03/2021
 * @author Biswajit Mahato
 *
 * Find the Equal Stacks
 *
 *  Problem Statement : https://www.hackerrank.com/challenges/equal-stacks/problem
 */
public class EqualStacks {

    static int equalStacks(int[] h1, int[] h2, int[] h3) {

        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        Stack<Integer> st3 = new Stack<Integer>();

        int st1TotalHeight = 0, st2TotalHeight = 0, st3TotalHeight = 0;

        // pushing consolidated height into the stack instead of individual cylinder
        // height
        for (int i = h1.length - 1; i >= 0; i--) {
            st1TotalHeight += h1[i];
            st1.push(st1TotalHeight);
        }
        for (int i = h2.length - 1; i >= 0; i--) {
            st2TotalHeight += h2[i];
            st2.push(st2TotalHeight);
        }
        for (int i = h3.length - 1; i >= 0; i--) {
            st3TotalHeight += h3[i];
            st3.push(st3TotalHeight);
        }

        while (true) {

            // If any stack is empty
            if (st1.isEmpty() || st2.isEmpty() || st3.isEmpty())
                return 0;

            st1TotalHeight = st1.peek();
            st2TotalHeight = st2.peek();
            st3TotalHeight = st3.peek();

            // If sum of all three stack are equal.
            if (st1TotalHeight == st2TotalHeight && st2TotalHeight == st3TotalHeight)
                return st1TotalHeight;

            // Finding the stack with maximum sum and
            // removing its top element.
            if (st1TotalHeight >= st2TotalHeight && st1TotalHeight >= st3TotalHeight)
                st1.pop();
            else if (st2TotalHeight >= st1TotalHeight && st2TotalHeight >= st3TotalHeight)
                st2.pop();
            else if (st3TotalHeight >= st2TotalHeight && st3TotalHeight >= st1TotalHeight)
                st3.pop();
        }

    }
}
