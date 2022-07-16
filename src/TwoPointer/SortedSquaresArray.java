package TwoPointer;

import java.util.Arrays;

/**
 * @Date : 04/04/2021
 * @author : Biswajit Mahato
 *
 * Problem Statement : Given an array of numbers, write a program to rank the array elements.
 *
 * Link : https://leetcode.com/problems/squares-of-a-sorted-array/
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100].
 */
public class SortedSquaresArray {

    public static int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];
        int curr = nums.length-1;
        int left =0, right = nums.length-1;
        while (left <= right){
            // left
            int tmpLeft = nums[left] * nums[left];
            // right
            int tmpRight = nums[right] * nums[right];
            if (tmpLeft > tmpRight) {
                result[curr] = tmpLeft;
                curr--;
                left++;

            } else {
                result[curr] = tmpRight;
                curr--;
                right--;
            }

        }

     return result;
    }
    public static void main(String[] args) {

        System.out.println( "Sum 1 :" + Arrays.toString(sortedSquares(new int[] {-4,-1,0,3,10}) ));
        System.out.println( "Sum 2 :" + Arrays.toString(sortedSquares(new int[] {-7,-3,2,3,11}) ));

    }


}
