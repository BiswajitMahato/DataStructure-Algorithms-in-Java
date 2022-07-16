package Array;

import java.util.HashSet;
import java.util.Set;

/**
 * Date 16/07/2022
 * @author Biswajit Mahato
 *
 * Find if there is a subarray with 0 sum
 * Given an array of positive and negative numbers, find if there is a subarray (of size at-least one) with 0 sum.
 * Input: {4, 2, -3, 1, 6}
 * Output: true
 * Explanation:
 * There is a subarray with zero sum from index 1 to 3.
 *
 * https://www.geeksforgeeks.org/find-if-there-is-a-subarray-with-0-sum/
 */
public class ZeroSumSubArray {

    public static boolean subArrayExists(int[] arr){

        Set<Integer> hs = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum+=arr[i];

            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash set
            if (arr[i] == 0
                || sum == 0
                || hs.contains(sum))
            return true;

            // Add sum to hash set
            hs.add(sum);
        }

        return false;
    }

    // Driver code
    public static void main(String arg[])
    {
        //int arr[] = { -3, 2, 3, 1, 6 };
        int arr[] = {4, 2, -3, 1, 6};
        if (subArrayExists(arr))
            System.out.println("Found a subarray with 0 sum");
        else
            System.out.println("No Such Sub Array Exists!");
    }
}
