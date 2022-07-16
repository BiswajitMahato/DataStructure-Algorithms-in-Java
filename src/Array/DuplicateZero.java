package Array;

import java.util.Arrays;

/**
 * @Date : 25/03/2021
 * @author : Biswajit Mahato
 *
 * Problem Statement : Given an array of numbers, write a program to rank the array elements.
 *
 * Link : https://algorithms.tutorialhorizon.com/rank-array-elements/
 *
 * Input: [1, 0, 2, 3, 0, 4, 5, 0]
 * Output: [1, 0, 0, 2, 3, 0, 0, 4]
 *
 */
public class DuplicateZero {

    public static void duplicateZeros(int[] arr) {
        System.out.println("Input: " + Arrays.toString(arr));
        Integer prev = null;
        for(int i=0; i<arr.length; i++){
            if(prev!=null){
                int x = arr[i];
                arr[i] = 0;
                shift(arr, i+1, x);
                prev = null;
            } else {
                if (arr[i] == 0) {
                    prev = 0;
                }
            }
        }
        System.out.println("Output: " + Arrays.toString(arr));
        System.out.println("-------------------------");
    }

    public static void shift(int [] arr, int index, int prev){
//        int prev = arr[index];
        for (int i = index; i <arr.length ; i++) {
            int temp = arr[i];
            arr[i] = prev;
            prev = temp;
        }
    }

    public static void main(String[] args) {
        duplicateZeros(new int [] {1, 0, 2, 3, 0, 4, 5, 0});
        duplicateZeros(new int [] {1, 0, 0, 0, 3, 4, 5});
        duplicateZeros(new int [] {1, 2, 3});
        duplicateZeros(new int [] {0, 0, 0});
    }

}
