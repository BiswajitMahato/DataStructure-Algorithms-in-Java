package Mathematicals;

/**
*
* Count of numbers with all digits same in a given range
 *
 * Given two integers L and R denoting the starting and end values of a range, the task is to count all numbers in that range whose all digit are same, like 1, 22, 444, 3333, etc.
 *
 * LInk -> https://www.geeksforgeeks.org/count-of-numbers-with-all-digits-same-in-a-given-range/
 * Example:
 *
 * Input: L = 12, R = 68
 * Output: 5
 * Explanation:
 * { 22, 33, 44, 55, 66} are the numbers with same digits in the given range.
 *
 * Input: L = 1, R = 32
 * Output: 11
 * *
 * @author Biswajit
 * @date 15 March 2021
 *
**/

public class SameDigitNumberCount {

        static int count_same_digit(int L, int R)
        {
            int tmp = 0, ans = 0;

            // Length of R
            int n = (int)Math.log10(R) + 1;

            for(int i = 0; i < n; i++)
            {

                // tmp has all digits as 1
                tmp = tmp * 10 + 1;

                // For each multiple of tmp
                // in range 1 to 9, check if
                // it present in range [L, R]
                for(int j = 1; j <= 9; j++)
                {
                    if (L <= (tmp * j) && (tmp * j) <= R)
                    {
                        // Increment the required count
                        ans++;
                    }
                }
            }
            return ans;
        }

        // Driver code
        public static void main(String[] args)
        {
            int L = 12, R = 68;

            System.out.println(count_same_digit(L, R));
        }

    }
