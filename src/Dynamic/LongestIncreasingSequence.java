package Dynamic;
/**
 * Date : 04/28/2020
 * @author : Biswajit Mahato
 *
 * Problem Type : Dynamic Programming
 * Problem Statement : You are being given an array named nums and you need to find the longest forming increasing sub-sequence from it.
 *                     Longest increasing sub-sequence is the longest sub-sequence such that
 *                     all elements of the sub-sequence are sorted in increasing order.
 *
 *
 */
public class LongestIncreasingSequence {

    // Considering 'n' is not equal to 0
    private int longestIncreasingSubsequence(int[] nums, int n){

        int maxLength = 0;

        // Initializing LIS array and filling them all with 1
        int[] LIS = new int[n];
        for(int i = 0; i < n; i++){
            LIS[i] = 1;
        }

        // This double loop fills the LIS array
        for(int i = 0; i <= n - 1; i++){
            for(int j = 0; j <= i - 1; j++){
                if (nums[i] > nums[j] && LIS[i] < LIS[j] + 1) {
                    LIS[i] = LIS[j] + 1;
                }
            }
        }

        // This loop just finds the maximum value among all the LIS[i] values
        for(int i = 0; i <= n - 1; i++){
            if(maxLength < LIS[i]){
                maxLength = LIS[i];
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestIncreasingSequence lis = new LongestIncreasingSequence();
        int[] nums = {11, 23, 10, 37, 21};
        int size = 5;
        System.out.println("The length of longest increasing subsequence for the array [11, 23, 10, 37, 21] is : " + lis.longestIncreasingSubsequence(nums, size));
    }

}
