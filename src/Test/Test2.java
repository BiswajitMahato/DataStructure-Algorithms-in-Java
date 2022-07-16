package Test;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args){

        int[] arr = {1,0,0,0,1,1,1,1,1,0};

        getResult(arr);

        getResult2(arr);
    }

    // Brute Force
    public static void getResult(int[] arr){

        int[] result = new int[arr.length];
        int ptr = 0;
        for(int i=0; i<arr.length; i++){

            if(arr[i] == 0){

                result[ptr] = 0;
                ptr++;
            }

        }

        for(int i=ptr; i<arr.length; i++){

            result[i] = 1;

        }

        System.out.println("Brute Force method");

        System.out.println(Arrays.toString(result));

        System.out.println("********************");
    }

    public static void getResult2(int[] arr){

        int left = 0;
        int right = arr.length-1;

        while(left < right){

            if(arr[left] == 1 && arr[right] == 0){

                swap(left,right,arr);
                left++;
                right--;
            }
            else if(arr[right] == 1){

                right --;
            }
            else if (arr[left] == 0){

                left ++;
            }


        }

        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int left, int right, int[] arr){

        int tmp;
        tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }

}
