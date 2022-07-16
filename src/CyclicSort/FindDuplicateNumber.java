package CyclicSort;

public class FindDuplicateNumber {

    public static void main(String[] args) {

        int[] arr = {3,1,3,4,2};

        System.out.println(duplicateNumber(arr));
    }
    public static int duplicateNumber(int[] nums) {

        int index = 0;
        while(index < nums.length){

            if (nums[index] != index+1){
                int correct = nums[index]-1;
                if (nums[index] != nums[correct])
                {
                    swap(index, correct, nums);
                }
                else {

                    return nums[index];
                }
            }else{

                index++;
            }


        }

        return -1;
    }
    private static void swap(int first, int second, int[] arr) {

        int tmp;
        tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;

    }


}
