package SlidingWindowProtocol;

/**
 * Date 17/03/2021
 * @author Biswajit Mahato
 *
 * Find the Number Line Jumps
 *
 *  Problem Statement : Given an array o integers n and a positive number k,
 *                      find the maximum sum of any contiguous subarray of size k;
 *
 *  Example : Input [2, 1, 5, 1, 3, 2] , k=3
 *  Output = 9
 *  Explaination : Subarray with maximum sum is {5,1 3}
 */
public class MaximumSumOfSubArray {


    public static int getMaxSumSubArrayOfKM(int[] A, int k){

        int windowSum = 0, maxSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += A[i];
        }

        for (int windowEndIndex = k; windowEndIndex < A.length ; windowEndIndex++) {

             windowSum += A[windowEndIndex] - A[windowEndIndex -k];
             maxSum = Math.max(maxSum,windowSum);
            
        }
        return  maxSum;

    }


}
