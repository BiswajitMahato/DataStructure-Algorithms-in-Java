package String;

import java.util.regex.Pattern;

public class ReverseWords_1 {

    public static void main(String[] args) {
        String str = "This is a string";
        String result = getReverse(str);
        System.out.println(result);
    }

    public static String getReverse(String str) {
        // Specifying the pattern to be searched
        Pattern pattern = Pattern.compile("\\s");

        // splitting String str with a pattern
        // (i.e )splitting the string whenever their
        //  is whitespace and store in temp array.

        String[] temp = pattern.split(str);
        String result = "";

        // Iterate over the temp array and store
        // the string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }


}
