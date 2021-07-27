package Mathematicals;

import java.util.Arrays;

/**
 * @Date : 24/03/2021
 * @author : Biswajit Mahato
 *
 * Problem Statement : GIven an array of numbers, find out if array contains three consecutive odd numbers
 *
 * Link : https://algorithms.tutorialhorizon.com/three-consecutive-odd-numbers/
 *
 * Input: [2, 4, 1, 3, 4, 1, 3, 6]
 * Output: Three consecutive odds: false
 * Explanation:
 */
public class ThreeConsecutiveOddNumbers {

    public static boolean check(int[] input) {
        int count = 0;
        for(int i=0;i<input.length;i++){
            if(input[i]%2!=0)
                count++;
            else
                count = 0;

            if(count==3)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {2, 4, 1, 3, 4, 1, 3, 6};
        System.out.println(Arrays.toString(nums) + ", three consecutive odds: " + check(nums));
        int [] nums_1 = {2, 4, 1, 3, 4, 1, 3, 5, 6};
        System.out.println(Arrays.toString(nums_1) + ", three consecutive odds: " + check(nums_1));
        int [] nums_2 = {2, 4, 1, 3, 4, 9, 1, 3, 0};
        System.out.println(Arrays.toString(nums_2) + ", three consecutive odds: " + check(nums_2));
    }
}
