package Array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Date : 25/03/2021
 * @author : Biswajit Mahato
 *
 * Problem Statement : Given an array of numbers, write a program to rank the array elements.
 *
 * Link : https://algorithms.tutorialhorizon.com/rank-array-elements/
 *
 * Input: [15, 12, 11, 10, 9]
 * Output: Rank: [5, 4, 3, 2, 1]
 * Explanation:
 */
public class RankArrayElements {

    public static void arrayRank(int[] arr) {

        System.out.println("Given array: " + Arrays.toString(arr));
        if(arr==null || arr.length==0)
            return;

        int [] temp = Arrays.copyOfRange(arr, 0, arr.length);

        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 1;
        int prev = temp[0];
        map.put(prev, index);

        for(int i=1; i<arr.length; i++){
            if(prev!=temp[i])
                index++;
            map.put(temp[i], index);
            prev=temp[i];
        }

        for(int i=0; i<arr.length; i++)
            temp[i] = map.get(arr[i]);

        System.out.println("Rank: " + Arrays.toString(temp));
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        arrayRank(new int[] {22, 11, 44, 66, 55});
        arrayRank(new int[] {15, 12, 11, 10, 9});
        arrayRank(new int[] {10, 20, 30, 40, 50});
        arrayRank(new int[] {10, 10, 10, 10, 20});

    }

}
