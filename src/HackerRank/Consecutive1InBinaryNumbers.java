package HackerRank;

import java.util.Scanner;

/**
 * Date 16/03/2021
 * @author Biswajit Mahato
 *
 * Consecutive 1's in Binary Numbers
 *
 *  Problem Statement : https://www.hackerrank.com/challenges/linkedin-practice-binary-numbers/problem
 */
public class Consecutive1InBinaryNumbers {

    public static int countConsecutive1sInBinary(int number) {
        int count = 0;

        while (number > 0) {
            number = number & (number << 1);
            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = countConsecutive1sInBinary(number);
        System.out.println(result);
        sc.close();
    }

}
