package Codeforces;

/*
    Problem : https://codeforces.com/problemset/problem/991/B
    Date : 30/09/2020
    Author : Biswajit Mahato
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Getting_an_A {

    static int N;
    static double[] grads;

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        N = Integer.parseInt(br.readLine());
        grads = new double[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        double runningSum = 0;

        for (int i = 0; i < N; i++) {
            grads[i] = Integer.parseInt(st.nextToken());
            runningSum += grads[i];
        }

        Arrays.sort(grads);
        int curr = 0;

        while(round(runningSum/N) != 5){
            runningSum += (5-grads[curr]);
            grads[curr] = 5;
            curr++;

        }
        System.out.println(curr);

        isr.close();
        br.close();
    }

    private static int round(double sum) {

        if (sum - ((int)sum)<0.5) return (int) sum;

        return (int) sum +1;
    }


}
