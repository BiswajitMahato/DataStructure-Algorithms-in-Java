package String;

import java.util.Arrays;
/**
 * Date 03/10/2021
 * @author : Biswajit Mahato
 *
 * Problem Link -> https://leetcode.com/problems/valid-palindrome/
 * Problem Statement : Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 *
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Input string is null");
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) !=Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;

    }
    public static boolean isPalindrome2(String s){
        char[] array = s.toLowerCase().replaceAll("[^A-Za-z]+", "").toCharArray();
        System.out.println(Arrays.toString(array));
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] != array[j]) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

       // String s = "A man, a plan, a canal: Panama";
        String s = "ab_a";

        boolean result = isPalindrome(s);
        boolean result2 = isPalindrome2(s);

        System.out.println("Result :"+result);
        System.out.println("Result2 :"+result2);
    }
}
