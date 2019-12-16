public class BubbleSort {
    public void bubbleSort(int[] arr, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; ++i) {

            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;

                }

            }
            if (!flag) break;
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 70, 6, 8, 5, 9, 100, 0};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr, arr.length);
        for (int k = 0; k < arr.length; k++){
            System.out.println(arr[k]);
        }

    }
}



