package CyclicSort;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = {3,0,1};

        missingNumber(arr);
    }
    public static int missingNumber(int[] nums) {

        int index = 0;
        while(index<nums.length){

            if (nums[index]<nums.length && nums[index] != nums[nums[index]]){
                swap(index,nums[index],nums);
            }else{

                index++;
            }
        }
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i  <nums.length ; i++) {
            if(nums[i] != i){

                System.out.println(i);
                return i;

            }
        }

        return nums.length;
    }
    private static void swap(int first, int second, int[] arr) {

        int tmp;
        tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;

    }

}
