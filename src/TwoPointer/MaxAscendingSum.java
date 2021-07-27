package TwoPointer;
/**
 * @Date : 04/04/2021
 * @author : Biswajit Mahato
 *
 * Problem Statement : Given an array of numbers, write a program to rank the array elements.
 *
 * Link : https://leetcode.com/problems/maximum-ascending-subarray-sum/
 *
 * Input: [10,20,30,5,10,50]
 * Output: 65
 * Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
 */
public class MaxAscendingSum {

    public static int maxAscendingSum(int[] nums) {

        int prefixSum = nums[0];
        int max = nums[0];
        for (int i=1; i<nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                prefixSum += nums[i];
            }
            else {
                prefixSum = nums[i];
            }
            max = Math.max(max, prefixSum);
        }
        return max;

        /*int ans = nums[0], sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum = nums[i] > nums[i-1] ? sum+nums[i] : nums[i];
            ans = ans > sum? ans: sum;
        }
        return ans;*/
    }
    public static void main(String[] args) {
        System.out.println( "Sum 1 :" + maxAscendingSum(new int[] {10,20,30,5,10,50}) );
        System.out.println( "Sum 2 :" + maxAscendingSum(new int[] {10,20,30,40,50}) );
        System.out.println( "Sum 3 :" + maxAscendingSum(new int[] {12,17,15,13,10,11,12}) );
        System.out.println( "Sum 4 :" + maxAscendingSum(new int[] {100,10,1}) );

    }

}
