package StriverArray;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        setZeroes(arr);
        int numRows = arr.length;
        int numCols = arr[0].length;
        for(int i=0;i<numRows;i++){
            for(int j=0;j<numCols;j++) {
                System.out.println(arr[i][j]);
            }
        }

    }

    private static void setZeroes(int[][] arr) {
        int[] row = new int[arr[0].length];
        Arrays.fill(row,0);
        int[] col = new int[arr.length];
        Arrays.fill(col,0);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) {
                if(arr[i][j]==0){
                    row[j]=1;
                    col[i]=1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) {
                if(row[j]==1 || col[i]==1){
                    arr[i][j]=0;
                }
            }
        }


    }
}
