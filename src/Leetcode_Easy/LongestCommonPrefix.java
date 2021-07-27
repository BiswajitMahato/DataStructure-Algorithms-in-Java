package Leetcode_Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Date : 18/10/2020
 * @author : Biswajit Mahato
 *
 * 14. Longest Common Prefix : https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {

    static int N;
    static String[] strs;
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        N = Integer.parseInt(br.readLine());
        strs = new String[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {

            strs[i] = st.nextToken();

        }
        String result = longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix :" + result);
    }
    public static String longestCommonPrefix(String[] strs) {

        // Empty String
        if (strs.length < 1 || strs == null) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;
        while(c < first.length())
        {
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        return c == 0 ? "" : first.substring(0, c);

    }


}
