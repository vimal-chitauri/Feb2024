package StriverArray;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> finalList=pascalTriangle(5);
        System.out.println(finalList);
    }


    public static List<List<Integer>> pascalTriangle(int row){
        List<Integer> ll;
        List<List<Integer>> finalList= new ArrayList<>();
        for (int i = 0; i < row; i++) {
            ll= new ArrayList<>();
            for (int j = 0; j < i+1; j++) {
                int PascalRow= (int) calculateNCR(i,j);
                ll.add(PascalRow);
            }
            finalList.add(ll);

        }

       return finalList;
    }
    public static long calculateNCR(int n, int r) {
        long res=1;
        for (int i = 0; i < r; i++) {
            res=res*(n-i);
            res= res/(i+1);
        }
        return res;
    }
}
