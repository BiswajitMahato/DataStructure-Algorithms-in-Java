package String;

public class ReverseWordAndEachLetter {

    public static String reverseWord(String str){
        String words[]=str.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        return reverseWord.trim();
    }
    public static void main(String[] args) {
        System.out.println(reverseWord("I love my India"));
        System.out.println(reverseWord("Cracking the coding interview"));
    }
}
