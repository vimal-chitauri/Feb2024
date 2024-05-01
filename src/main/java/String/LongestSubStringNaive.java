package String;

import java.util.Arrays;

public class LongestSubStringNaive {
    public static void main(String[] args) {
        String s="";
        longestSubstring(s);
    }

    private static void longestSubstring(String s) {
        int[] hasSet = new int[256];
        int maxCount=0;
        Arrays.fill(hasSet,0);
        for (int i = 0; i < s.length(); i++) {
            int count=0;
            Arrays.fill(hasSet,0);
            for (int j = i; j < s.length(); j++) {
                if(hasSet[s.charAt(j)]==1){
                    break;
                }else{
                    hasSet[s.charAt(j)]++;
                    count++;
                    maxCount= Math.max(count,maxCount);
                }
            }
        }
        System.out.println(maxCount);
    }
}
