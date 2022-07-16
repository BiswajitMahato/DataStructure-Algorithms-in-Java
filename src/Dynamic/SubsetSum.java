package Dynamic;
/**
 * Date : 10/01/2022
 * @author : Biswajit Mahato
 *
 * Longest Substring Without Repeating Characters
 *
 * Problem Statement : Given a string s, find the length of the longest substring without repeating characters.
 *
 * Link : https://www.geeksforgeeks.org/subset-sum-problem-dp-25/
 * Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
 * Output: True
 * There is a subset (4, 5) with sum 9.
 *
 * Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 30
 * Output: False
 * There is no subset that add up to 30.
 *
 */
public class SubsetSum {

    // Recursive Approach
    public static boolean isSubsetSum(int set[], int n, int sum){

        // Base case
        if (sum == 0){
            return true;
        }
        if(n == 0){
            return false;
        }

        // If last element is greater than sum, then ignore it
        if (set[n - 1] > sum)
            return isSubsetSum(set, n - 1, sum);

        /* else, check if sum can be obtained
           by any of the following
            (a) including the last element
            (b) excluding the last element */
        return isSubsetSum(set, n - 1, sum)
                || isSubsetSum(set, n - 1, sum - set[n - 1]);
    }



    public static void main(String args[])
    {
        int set[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        int n = set.length;
        if (isSubsetSum(set, n, sum) == true)
            System.out.println("Found a subset"
                    + " with given sum");
        else
            System.out.println("No subset with"
                    + " given sum");
    }

}
