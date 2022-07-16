package TwoPointer;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Date : 03/04/2021
 * @author : Biswajit Mahato
 *
 * Problem Statement : Write a function that reverses a string. The input string is given as an array of characters
 *
 * Link : https://leetcode.com/problems/reverse-string/
 *
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 */
public class ReverseString {

    public static void main(String[] args) {
        reverseString(new String[] {"h","e","l","l","o"});
        reverseString(new String[] {"H","a","n","n","a","h"});

    }
    public static void reverseString(String[] s) {
       String[] result = new String[s.length];
       int start = s.length -1;
       int end = 0;
        for (int i = 0; i <=s.length -1 ; i++) {

            result[i]=s[start];
            start--;
            
        }
        System.out.println("Result Array :"+ Arrays.toString(result));

    }
}
