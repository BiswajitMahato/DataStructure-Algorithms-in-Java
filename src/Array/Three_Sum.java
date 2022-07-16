package Array;

import java.util.*;

/**
 * @Date : 17/05/2021
 * @author : Biswajit Mahato
 *
 * Problem Statement : Given an array of numbers, write a program to find the sum of the three array elements.
 *
 * Link : https://leetcode.com/problems/3sum/
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 */
public class Three_Sum {

    public static void main(String[] args) {

        int[] nums = new int[]{ -1,0,1,2,-1,-4};

        List<List<Integer>> res = threeSum(nums);
        System.out.println("Result :"+res);
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();
        // List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length < 3) {
            return new ArrayList<>(result);
        }
        Arrays.sort(nums); // Sort the elements

        int size = nums.length;

        for (int i = 0; i < size - 2; i++) // Now fix the first element and find the other two elements
        {
            // To find the other two elements, start two index variables
            // from two corners of the array and move them toward each other
            int left = i + 1;
            int right = size - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }

}
