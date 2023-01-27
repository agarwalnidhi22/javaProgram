package Array1d;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 9, 1, 2, 3};
        boolean flag = false;
        int count = 0;
        int key = 6;
        int l = 0;
        int r = arr.length - 1;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] == key) {
                System.out.println("element found");
                flag = true;
                break;
            }
            if (arr[mid] > key) {
                l = mid + 1;
            }
            if (arr[mid] < key) {
                r = mid - 1;
            }
        }
        if (flag == false) {
            System.out.println("element not found");
        }
    }
}

