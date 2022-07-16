package HackerRank;

import java.util.Scanner;
import java.util.Stack;

/**
 * Date 16/03/2021
 * @author Biswajit Mahato
 *
 * Find the Maximum Element
 *
 *  Problem Statement : https://www.hackerrank.com/challenges/maximum-element/problem
 */
public class MaximumElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        maxStack.push(Integer.MIN_VALUE);

        for (int i = 0; i < N; i++) {
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    int item = sc.nextInt();
                    mainStack.push(item);
                    int maxSoFar = maxStack.peek();
                    if (item > maxSoFar) {
                        maxStack.push(item);
                    } else {
                        maxStack.push(maxSoFar);
                    }
                    break;
                case 2:
                    mainStack.pop();
                    maxStack.pop();
                    break;

                case 3:

                    System.out.println(maxStack.peek());
                    break;
            }
        }
        sc.close();
    }

}
