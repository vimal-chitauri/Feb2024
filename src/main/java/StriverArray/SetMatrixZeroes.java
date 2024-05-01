package StriverArray;

public class SetMatrixZeroes {
    public static boolean rowModified=false;
    public static boolean colModified=false;
    public static void main(String[] args) {
        int[][] arr = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        //[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
        //[[0,0,0,0],[0,4,5,2],[0,3,1,5]]
        //[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
        setZeroes(arr);
        int numRows = arr.length;
        int numCols = arr[0].length;
        for(int i=0;i<numRows;i++){
            for(int j=0;j<numCols;j++) {
                System.out.println(arr[i][j]);
            }
        }

    }
    public static void setZeroes(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        for(int i=0;i<numRows;i++){
            for(int j=0;j<numCols;j++) {
              if(matrix[i][j]==0){

                    transformRowMatrix(matrix,i);

                    transformColMatrix(matrix,j);
              }
            }
        }


        for(int i=0;i<numRows;i++){
            for(int j=0;j<numCols;j++) {
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }

    }

    private static void transformRowMatrix(int[][] matrix,int i) {
        int numCols = matrix[0].length;
        for (int k = 0; k < numCols; k++) {
            if(matrix[i][k]!=0)
                matrix[i][k]=-1;
        }
        rowModified=true;
    }
    private static void transformColMatrix(int[][] matrix,int j) {
        int numCol = matrix.length;
        for (int k = 0; k < numCol; k++) {
            if(matrix[k][j]!=0)
                matrix[k][j]=-1;
        }
        colModified=true;
    }
}
