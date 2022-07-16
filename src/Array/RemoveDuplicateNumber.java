package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateNumber {

    public static void main(String[] args) {

        List<Integer> res = getRemoveDuplicateNumber(Arrays.asList(2,3,4,5,6,2,4,3,8,9,8));
        System.out.println(res);
    }

    private static List<Integer> getRemoveDuplicateNumber(List<Integer> list) {

        List<Integer> result = new ArrayList<>();

        int size = list.size();
         int j = list.get(0);


         try {

             for (int i = 0; i < size; i++) {

                 result.add(i);

                 for (int k = i + 1; k < size - 1; k++) {

                     if (result.get(i) != list.get(k)) {

                         continue;

                     } else {

                         list.remove(k);
                     }

                 }
             }
         }catch (Exception e){

             System.out.println(e);
             e.printStackTrace();
         }

        return result;

    }

}
