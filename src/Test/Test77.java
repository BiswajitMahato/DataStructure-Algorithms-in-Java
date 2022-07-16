package Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test77 {


    public static void main(String[] args) {

        String str = "$bisw#ajeet%";

        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length;
        char[] result = new char[arr.length];
        while(right>left){

            Pattern p = Pattern.compile("[a-zA-Z0-9 ]*");
            Matcher m = p.matcher(str);
            // boolean b = m.matches();
            boolean b = m.find();
            boolean leftChar = m.find(arr[left]);
            boolean rightChar = m.find(arr[right]);

            if(leftChar == true && rightChar == true)
            {
                result[left] = arr[left];
                result[right] = arr[right];
                left ++;
                right--;
            }
            else if (leftChar == true && rightChar == false){

                result[left] = arr[left];
                left++;

            }
            else if(leftChar == false && rightChar == true){


                result[right] = arr[right];
            right--;

            }
            else{

                result[left] = arr[right];
                result[right] = arr[left];


            }

            System.out.println(" Result :"+result);

    }


}
}
