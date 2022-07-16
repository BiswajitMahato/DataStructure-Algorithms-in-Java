package AlgoExpert;
/**
 * Date 07/08/2021
 * @author Biswajit Mahato
 *
 * Pelindrome check in a String
 *
 *
 */
public class String_PelindromeCheck {
    public static void main(String[] args) {

        boolean res = getPelndromeCheck("abkcaba");

        System.out.println(res);

    }
    public static boolean getPelndromeCheck(String str){

        char[] arr = str.toCharArray();
        int len = str.length();
        int start = 0;
        int end = len-1;

        while(start<end) {

            if(arr[start] == arr[end]){

                start++;
                end--;

            }else{

                return  false;
            }

        }



        return true;
    }

}
