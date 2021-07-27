package TwoPointer;

import java.util.Arrays;

/**
 * Date 18/03/2021
 * @author Biswajit Mahato
 *
 * Find two numbers such that they add up to a specific target number.
 *
 *  Problem Statement : Given an array of integers numbers that is already sorted in ascending order,
 *                      find two numbers such that they add up to a specific target number.
 *
 *  Link : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 *
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class TwoSumII {

    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(arr,target);

        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];
        int start = 0;
        int end = numbers.length -1;

        while (start < end){

            int sum = numbers[start] + numbers[end];

            if ( sum == target){

                result[0] = start+1;
                result[1] = end+1;
                break;
            }
            else if( sum > target){
                end --;
            }
            else{
                start ++;
            }


        }

        return result;

    }

}
