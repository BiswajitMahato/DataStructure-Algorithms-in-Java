package Codeforces;

/*
    Problem : https://codeforces.com/problemset/problem/160/A
    Date : 27/09/2020
    Author : Biswajit Mahato
 */


import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Twins {

    static int N;
    static Integer[] coins;

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        N = Integer.parseInt(br.readLine());
        coins = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int twinSum = 0;
        for (int i = 0; i <N; i++) {
            coins[i] = Integer.parseInt(st.nextToken());
            twinSum += coins[i];
        }

        Arrays.sort(coins, Collections.reverseOrder());

        int sol = 0;
        int mySum = 0;
        while (mySum <= twinSum && sol < N){

            mySum += coins[sol];
            twinSum -= coins[sol];
            sol++;
        }
        System.out.println(sol);

        br.close();
        isr.close();
    }


}
