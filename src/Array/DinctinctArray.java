package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Date 05/07/2020
 * @author : Biswajit Mahato
 *
 * Problem Type : Dstrinct String Problem
 * Problem Number :
 *
 */

public class DinctinctArray {

    // Checking duplicate elements in an array.
    public static void isArrayUnique( Integer arr[]){
        // Hash Set implementation
        Set  set=new HashSet(Arrays.asList(arr));
        if(arr.length==set.size()){
            System.out.println("Given array has all unique or distinct elements " + Arrays.toString(arr));
        }else{
            System.out.println("Given array does not contains all unique elements, and contains duplicate elements " + Arrays.toString(arr));
        }

    }

    public static void main(String[] args) {

        Integer [] arrA = { 2, 3, 6, 7, 10, 9, 1};
        isArrayUnique(arrA);
        Integer [] arrB = { 1, 2, 3, 6, 4, 9, 8, 2};
        isArrayUnique(arrB);
    }

}
