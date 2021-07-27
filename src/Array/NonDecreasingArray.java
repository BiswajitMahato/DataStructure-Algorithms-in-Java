package Array;

/**
 * @Date : 25/03/2021
 * @author : Biswajit Mahato
 *
 * Problem Statement : Given an array of numbers, you need to find out whether an array can be converted
 *                     to a non-decreasing array where you are allowed to modify the maximum one element in the array.
 *
 * Link : https://algorithms.tutorialhorizon.com/non-decreasing-array-with-one-allowed-change/
 *
 * Input:  [4, 5, 1, 7]
 * Output: true
 * Change 1 to 6 or 5 or 7
 *
 */
public class NonDecreasingArray {

    public static boolean check(int[] input) {
        int countR = 0;
        int len = input.length;
        int prev = input[len-1];
        for(int i=len-2;i>=0;i--){
            if(prev<input[i]){
                countR++;
            }else
                prev = input[i];
        }
        int countL = 0;
        prev = input[0];
        for(int i=1;i<len;i++){
            if(prev>input[i]){
                input[i] = prev+1;
                countL++;
            }else
                prev = input[i];
        }
        int result = Math.min(countR, countL);
        return result>1?false:true;
    }

    public static void main(String[] args) {
        System.out.println(check(new int []{4, 5, 1, 7}));
        System.out.println(check(new int []{10, 5, 2}));
        System.out.println(check(new int []{1, 2, 1, 5}));
        System.out.println(check(new int []{1, 1, 1, 1}));
    }

}
