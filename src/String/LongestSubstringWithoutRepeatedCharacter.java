package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatedCharacter {

    public static void main(String[] args) {

        LengthOfLongestSubString("java");
    }

    private static void LengthOfLongestSubString(String s) {

        String longestSubString = null;
        int longestSubStringLength = 0;

        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] arr = s.toCharArray();

        for (int i = 0; i <arr.length ; i++) {
            char ch = arr[i];
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }else{
                i=map.get(ch);
                map.clear();
            }
            if(map.size() > longestSubStringLength){
                longestSubStringLength = map.size();
                longestSubString =map.keySet().toString();
            }
        }
        System.out.println("Longest SubString :"+longestSubString);
        System.out.println("Longest SubString Length :"+longestSubStringLength);
    }
}
