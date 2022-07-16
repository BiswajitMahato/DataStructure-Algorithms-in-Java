package CyclicSort;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Date 08/09/2021
 * @author : Biswajit Mahato
 *
 * Problem Type : Syclic Sort
 * Problem Number : Sort an array [1-n]
 *
 */
public class CyclicSort {

    public static void main(String[] args) {

        int[] arr = {1,4,6,8,9,3,5,7,2};

        System.out.println("Before Sort : "+Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println("After Sort : "+Arrays.toString(arr));
        //String[] strArray = new String[] {"John", "Mary", "Bob"};

        // #1 for String
        Arrays.asList(arr).stream().forEach(s -> System.out.println(s));

        // #2 for String
        Stream.of(arr).forEach(System.out::println);

        // #3
        Arrays.stream(arr).forEach(System.out::println);


    }
    // [0 -> n-1]
    public static void cyclicSort(int[] arr){

        int index = 0;
        while(index<arr.length){

            int correct = arr[index]-1;

            if (arr[index] != arr[correct]){
                swap(index,correct,arr);
            }else{

                index++;
            }
        }

    }
    private static void swap(int first, int second, int[] arr) {

        int tmp;
        tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;

    }


}
