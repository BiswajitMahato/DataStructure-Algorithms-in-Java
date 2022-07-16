package Test;

public class Test4 {

    public static int numOfPairs(String[] nums, String target) {

        int count = 0;
        for(int i=0; i<nums.length; i++){
            String tmp = nums[i];

            for(int j=0; j<nums.length; j++) {

                if (i == j) {
                    continue;

                } else {
                    tmp = tmp + nums[j];

                    if (tmp.equals(target)) {
                        tmp = tmp.substring(0, nums[i].length());
                        System.out.println(" Pairs :" + nums[i] + " - " + nums[j]);

                        count++;
                    } else {
                        tmp = tmp.substring(0, nums[i].length());
                    }
                }
            }

        }

        return count;

    }

    public static void main(String[] args) {

        String[] str = {"777","7","77","77"};
        int result = numOfPairs(str,"7777");

        System.out.println("Result :"+result);
    }
}
