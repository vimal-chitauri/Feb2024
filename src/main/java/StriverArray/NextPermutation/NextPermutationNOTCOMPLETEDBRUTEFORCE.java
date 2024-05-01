package StriverArray.NextPermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutationNOTCOMPLETEDBRUTEFORCE {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int[] result=nextPermutation(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] nextPermutation(int[] arr) {

        List<Integer> ds= new ArrayList<>();
        Boolean[] booleansArray= new Boolean[arr.length];
        Arrays.fill(booleansArray,false);
        List<List<Integer>> ans= new ArrayList<>();
        permutations(ds,arr,ans,booleansArray);
        System.out.println(ans);


        int[] finalResult=arr;
        for (int i = 0; i < ans.size(); i++) {
            int[] tmp= ans.get(i).stream().mapToInt(Integer::intValue).toArray();
            int compareValue=Arrays.compare(tmp,arr);

            if(compareValue>0){
                finalResult=tmp;
                break;
            }

        }
        return finalResult;
    }

    private static void permutations(List<Integer> ds, int[] arr, List<List<Integer>> ans,Boolean[] booleansArray) {
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if(!booleansArray[i]){
                ds.add(arr[i]);
                booleansArray[i]=true;
                permutations(ds,arr,ans,booleansArray);
                ds.remove(ds.size()-1);
                booleansArray[i]=false;
            }


        }

    }
}
