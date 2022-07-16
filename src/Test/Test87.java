package Test;

public class Test87 {

    // I/P : aaaa bbb cc daabc
    //O/P: a4b3c2d1a2b1c1
    public static void main(String[] args) {

        String  str = "aaaabbbccdaabc";
        getcharContinousOccurence(str);

    }

    public static void getcharContinousOccurence(String str){

        char[] arr = str.toCharArray();

        int i = 0;
        int j = i+1;
        int count = 1;

        while(j <= arr.length-1) {

            if (arr[i] == arr[j]) {
                count++;
                j++;
            }
            else if(j == arr.length-1){

                if(arr[j] == arr[i]){

                    count = count+1;
                }
                else{

                    System.out.print(arr[j]);
                    System.out.print(count);
                    break;

                }

            }

            else{

                System.out.print(arr[i]);
                System.out.print(count);
                i = j;
                j = i+1;
                count = 1;
            }

        }


    }

}
