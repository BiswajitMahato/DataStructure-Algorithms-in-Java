package Leetcode_Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Date : 17/10/2020
 * @author : Biswajit Mahato
 *
 * 13. Roman to Integer : https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {

    static String N;
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        N = br.readLine();

        RomanToInteger r = new RomanToInteger();
        int number = r.romanToInt(N);

        System.out.println("Integer number :" + number);

    }
    public int romanToInt(String s) {

        if (s == null || s.length() == 0)
            return -1;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int num = 0;
        num = num + map.get(s.charAt(0));

        for(int i=1;i<s.length();i++){

            if(map.get(s.charAt(i)) <= map.get(s.charAt(i-1))){

                num = num + map.get(s.charAt(i));

            }else{

                num = num - 2*map.get(s.charAt(i-1)) + map.get(s.charAt(i));
            }
        }
        return num;

    }

}
