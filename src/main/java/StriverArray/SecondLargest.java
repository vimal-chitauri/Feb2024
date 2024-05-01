package StriverArray;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = new int[]{10,5,8,3,2};
        secondLargest(arr);
    }

    private static void secondLargest(int[] arr) {
        int largest= largest(arr);
        int res=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<arr[largest]);
                if(res==-1){
                    res=arr[i];
                }
        }
    }

    private static int largest(int[] arr){
        int res=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>res){
                res=i;
            }
        }
        return res;
    }
}
