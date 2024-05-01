package Array;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3,8};
        int start = 0;
        int end = arr.length-1;
        System.out.println(stockBuyAndSell(arr, start, end));
    }

    private static int stockBuyAndSell(int[] arr, int start, int end) {

        if (start > end) {
            return 0;
        }
        int result = 0;
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                int curr_profit = 0;
                if (arr[j] > arr[i])
                    curr_profit = arr[j] - arr[i] + stockBuyAndSell(arr, start, i - 1) +
                            stockBuyAndSell(arr, j + 1, end);
                result = Math.max(result, curr_profit);
            }

        }
         return result;

    }
}
