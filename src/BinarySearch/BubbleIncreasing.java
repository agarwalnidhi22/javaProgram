package BinarySearch;

import java.util.Arrays;

public class BubbleIncreasing {
    public static void main(String[] args) {
        int[] a = {1, 4, 2, 3, 7, 9, 8};
        BubbleSort(a);
        System.out.println(Arrays.toString(a));


    }

    static void BubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int flag = 0;
            for (int j = 0; j < a.length; j++) {

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = 1;

                }
            }
            if (flag == 0) {
                break;
            }

        }
    }
}
