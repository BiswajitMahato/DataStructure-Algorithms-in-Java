package Codeforces;

/*
    Problem : https://codeforces.com/problemset/problem/1216/B
    Date : 30/09/2020
    Author : Biswajit Mahato
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Shooting {

    static int N;
    static Integer[] coins;

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        N = Integer.parseInt(br.readLine());
        coins = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int twinSum = 0;
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(st.nextToken());
            twinSum += coins[i];
        }
    }

}
