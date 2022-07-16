package Leetcode_Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxLenghtBetweenTwoEqualCharacter {

    static String N;
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        N = br.readLine();
        int result = maxLengthBetweenEqualCharacters(N);
        System.out.println("Result :"+ result);

    }
    public static int maxLengthBetweenEqualCharacters(String str) {

        int n = str.length();
        int res = -1;

        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (str.charAt(i) == str.charAt(j))
                    res = Math.max(res,
                            Math.abs(j - i - 1));

        return res;

    }

}
