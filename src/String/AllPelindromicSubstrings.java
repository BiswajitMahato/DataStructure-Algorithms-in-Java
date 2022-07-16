package String;

import java.util.Scanner;

/**
 *
 * Date : 05/06/2022
 * @author : Biswajit Mahato
 * Problem Statement : Print All Palindromic Substrings
 * Given a string, print all palindromic substrings of it.
 * A substring of a string is a contiguous subsequence of that string, i.e. it can be formed by deleting 0 or more characters from start and end of the string.
 * For a string str = "abbc", a substring can be "a", "ab", "abb", etc. but "abc" cannot be a substring, as it is not contiguous. Also, "ba" is not a substring, as the order of characters is changed.
 * A string is said to be a palindrome if the string read from left to right is equal to the string read from right to left. For example), strings "abba", "a", "aba", etc are palindromes, but strings "ab", "abc", etc. are not palindromes.

 * Link : https://www.geeksforgeeks.org/next-greater-element/

 */
public class AllPelindromicSubstrings {

    public static void solution(String str) {
        for (int i = 0 ; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                // i -> starting point of substring, j-> ending point of substring
                if (isPalindrome(str.substring(i, j))) {
                    System.out.println(str.substring(i, j));
                }
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}
