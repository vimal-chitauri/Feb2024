package String;

import java.util.HashMap;

public class LongestSubStringEfficient {
    public static void main(String[] args) {
        String s="abba";
        longestSubstring(s);
    }

    public static void longestSubstring(String s){
        int i=0,j=0,maxCount=0;
        HashMap<Character,Integer> hm= new HashMap<>();
        for (j = 0; j < s.length(); j++) {
            if(hm.containsKey(s.charAt(j))){
                i=Math.max(i,hm.get(s.charAt(j))+1);
            }
                hm.put(s.charAt(j), j);
                maxCount = Math.max(maxCount, j - i + 1);

        }
        System.out.println(maxCount);
    }
}
