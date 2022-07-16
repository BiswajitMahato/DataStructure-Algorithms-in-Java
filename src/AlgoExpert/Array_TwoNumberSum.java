package AlgoExpert;

import java.util.Arrays;

public class Array_TwoNumberSum {

    public static void main(String[] args) {

        int[] results;
        int[] arr = {3,6,-11,14,30,60,21,-4};
        int target = 20;
        results = getTwoNumberSum(arr,target);

        System.out.println("Sum :"+ Arrays.toString(results));
    }

    private static int[] getTwoNumberSum(int[] arr, int target) {

        int[] noElements = {};

        int left = 0;
        int right = arr.length -1;
        Arrays.sort(arr);
        int[] result;
        int currentSum=0;
        int i=0;
        while (left <right){
            currentSum = arr[left]+arr[right];
            if(currentSum == target){

                result = new int[]{arr[left], arr[right]};

                System.out.println("left :"+arr[left]);
                System.out.println("right :"+arr[right]);

                return result;
            }
            else if(currentSum < target){
                left++;
            }
            else {
                right--;
            }
        }

        return noElements;
    }


}
