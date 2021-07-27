package Leetcode_Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Date : 19/10/2020
 * @author : Biswajit Mahato
 *
 * 20. Valid Parentheses : https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {

    static String N;
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        N = br.readLine();
        boolean result = isValid(N);
        System.out.println(" The String is :" + result);

    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[' ){
                stack.push(c);
            }
            else {

                if (stack.isEmpty()){
                    return  false;
                }
                if (c == ')' && stack.pop() != '('){
                    return false;
                }
                if (c == '}' && stack.pop() != '{'){
                    return false;
                }
                if (c == ']' && stack.pop() != '['){
                    return false;
                }

            }

        }
        
        return  stack.isEmpty();
        
    }

}
