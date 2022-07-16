package Amazon;
/**
 * Date 05/07/2020
 * @author : Biswajit Mahato
 *
 * Problem Type : String Problem
 * Problem Number : Leetcode -> 443. String Compression
 *
 */
public class LC_443_StringCompression {

     public static int compress(char[] chars){

          int index = 0;
          int i = 0;
          while(i < chars.length){
              int j = i;
              while(j<chars.length && chars[j] == chars[i]){

                    j++;
              }
              chars[index++] = chars[i];
              if(j - i >1){

                  String count = j - i + "";
                  for(char c:count.toCharArray()){

                      chars[index++] = c;
                  }

              }

              i = j;
          }
       return index;
     }

    public static void main(String[] args) {

         char[] arr = {'a','a','b','b','c','c','c'};

         int count = compress(arr);

         System.out.println("Count :"+count);
    }


}
