package String;

public class RemoveSpecialCharFromString {

    public static void main(String[] args) {

        String str = "Ilove%9875$_!@&HYT&^*";

        String result = str.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(result);

    }
}
