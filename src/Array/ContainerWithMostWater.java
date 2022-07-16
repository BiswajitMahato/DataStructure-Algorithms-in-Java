package Array;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int res = maxArea(arr);

        System.out.println(res);

    }

   /* public static int maxArea(int[] height) {

        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {

            for (int j = i+1; j < height.length; j++) {
                int width = j-i;
                int heights = Math.min(height[i],height[j]);
                int area = width*heights;
                maxArea = Math.max(maxArea,area);

            }

        }
        return  maxArea;

    }
*/
   public static int maxArea(int[] height) {

       int maxArea = 0;
       int start = 0;
       int end = height.length-1;

       while (start<end) {

           int width = end - start;
           int heights = Math.min(height[start], height[end]);
           int area = width * heights;
           maxArea = Math.max(maxArea, area);

           if(height[start] <= height[end]) {
               start++;
           } else {
               end--;
           }
       }
       return  maxArea;

   }


}
