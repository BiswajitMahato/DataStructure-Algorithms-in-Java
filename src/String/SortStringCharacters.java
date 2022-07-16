package String;

import java.util.Arrays;

public class SortStringCharacters {

    public static void main(String[] args) {

        String str = "path";
        char[] arr = str.toCharArray();

        // Approach 1
        char tmp;
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {

                if(arr[i] > arr[j]){

                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;

                }


            }

        }
        System.out.println(new String(arr));

        //Approach 2
        String str1 = "lenovo";
        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);

        System.out.println(new String(arr1));
    }
}
