package QuickSortProgram;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        quickSort1(arr, 0, n - 1);

        //print
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }

    static void quickSort1(int arr[], int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort1(arr, low, pivotIndex - 1);
            quickSort1(arr, pivotIndex + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
}