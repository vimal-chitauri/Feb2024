package Recursion;

import java.util.Arrays;

public class Palingdrome {
    public static void main(String[] args) {
        String[] text= new String[]{"A", "B","A", "C", "C", "A", "B", "B", "A"};
        System.out.println(isPalingdrome(text,0,8));
        System.out.println(printSum(5));
    }

    private static boolean isPalingdrome(String[] text, int start, int end) {
        if(start>end || start==end){
            return true;
        }

        if(text[start]==text[end]){
            return isPalingdrome(text,start+1,end-1);
        }
        return false;
    }

    static int printSum(int n){

        if(n<0)
            return 0;

        return n+printSum(n-1);
    }
}
