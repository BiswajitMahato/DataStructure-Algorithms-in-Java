package Array;
/**
 * Date 22/09/2021
 * @author Biswajit Mahato
 *
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 *
 *
 * https://leetcode.com/problems/trapping-rain-water/
 */
public class TrappingRainWater {

    public static void main(String[] args) {

        //height = [0,1,0,2,1,0,1,3,2,1,2,1]
        //Output: 6
    }
    // Brute Force
    public static int trap(int[] a) {

        int n = a.length;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = a[0];

        for(int i=1; i<n; i++){
            left[i] = Math.max(left[i-1],a[i]);
        }

        right[n-1] = a[n-1];
        for(int i=n-2; i>=0; i--){
            right[i] = Math.max(right[i+1],a[i]);
        }
        int ans = 0;

        for(int i=0; i<n; i++){

            ans +=(Math.min(left[i],right[i])-a[i]);
        }

        return ans;

    }
    // Optimize // Space -> O(1)
    public static int trap2(int[] height) {
        int n = height.length;
        int lo = 0, hi = n - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;
        while (lo < hi) {
            // update
            if (height[lo] > leftMax)  leftMax = height[lo];
            if (height[hi] > rightMax) rightMax = height[hi];
            // compute
            if (leftMax < rightMax) { // consider the min
                water += (leftMax - height[lo]); // leftMax >= height[lo]
                ++lo;
            } else {
                water += (rightMax - height[hi]);
                --hi;
            }
        }
        return water;
    }
}
