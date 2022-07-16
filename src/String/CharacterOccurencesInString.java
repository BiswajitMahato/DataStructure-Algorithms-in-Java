package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccurencesInString {

    public static void main(String[] args) {

        String str = "Programming";
        // Approach 1
        char[] arr= str.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            
            if (map.containsKey(arr[i])){

                map.put(arr[i],map.get(arr[i])+1);
                
            }
            else {
                map.put(arr[i],1);
            }
            
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

}
