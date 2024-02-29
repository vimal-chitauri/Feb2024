package Array;

public class ArrayBasicOperation {
    public static void main(String[] args) {
        int capacity = 6; //max element it can hold
        int size = 5;
        int element = 50;
        int index_at_element_insert = 3;
        int[] arr = new int[]{10,20,3,40,50};

        // insert(arr, size, capacity, element, index_at_element_insert);

       // deleteElement(arr,size,element);
        for (int i = 0; i < size; i++) {
         //   System.out.println(arr[i]);
        }

        System.out.println(getLargest(arr,size));


    }

    public static int insert(int[] arr, int size, int capacity,
                             int element, int index_at_element_insert) {
        if (size == capacity)
            return size;
        int index = index_at_element_insert - 1;

        for (int i = size-1; i >= index; i--) {
            arr[i + 1] = arr[i];

        }
        arr[index] = element;
        return size + 1;
    }

    static int deleteElement(int arr[],int size, int element_to_Delete){
        int i;
        for (i = 0; i < size; i++) {
            if(arr[i]==element_to_Delete)
                break;
        }
        if(i==size)
            return size;

        for (int j = i; j < size-1; j++) {
            arr[j]=arr[j+1];
        }
        return size-1;
    }

    public static int getLargest(int[] arr, int size){
        int res=0;
        for (int i = 1; i < size; i++) {
            if(arr[i]>arr[res]){
                res=i;
            }

        }
        return res;
    }


}
