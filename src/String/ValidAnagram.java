package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Date 03/10/2021
 * @author : Biswajit Mahato
 *
 * Problem Link -> https://leetcode.com/problems/valid-anagram/
 * Problem Statement : Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 *
 */
public class ValidAnagram {

    // Using inbuilt sort function
    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){

            return false;
        }

        char[] tmp1 = s.toCharArray();
        char[] tmp2 = t.toCharArray();

        Arrays.sort(tmp1);
        Arrays.sort(tmp2);

        for (int i = 0; i <tmp1.length ; i++) {

            if(tmp1[i] != tmp2[i]){

                return false;
            }

        }

        return true;

    }
    // Using Hashmap
    public static boolean isAnagram2(String s, String t) {

        if(s.length() != t.length()){

            return false;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        for (int i = 0; i <arr1.length ; i++) {
            if(map1.containsKey(arr1[i])){
                map1.put(arr1[i],map1.get(arr1[i])+1);
            }
            if(map2.containsKey(arr2[i])){
                map2.put(arr2[i],map2.get(arr2[i])+1);
            }
            if(map1.containsKey(arr1[i]) == false && map2.containsKey(arr2[i]) == false){
                map1.put(arr1[i],1);
                map2.put(arr2[i],1);
            }
            if(map1.containsKey(arr1[i]) == false && map2.containsKey(arr2[i]) == true){
                map1.put(arr1[i],1);
            }
            if(map1.containsKey(arr1[i]) == true && map2.containsKey(arr2[i]) == false){
                map2.put(arr2[i],1);
            }
        }

        /*for ( Map.Entry<Character, Integer> entry : map1.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            // do something with key and/or tab
        }*/

        return map1.equals(map2);

    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = isAnagram2(s,t);
        System.out.println(result);
    }

}
