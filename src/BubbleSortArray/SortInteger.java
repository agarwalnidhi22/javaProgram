package BubbleSortArray;

public class SortInteger {
    public static void main(String[] args) {

        int[] a= {4,2,1,2,6};
        int temp;
        for(int i=0; i<a.length; i++) {
            int flag = 0;
            for (int j = 0; j < a.length - 1 - i; j++) {

                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }

        System.out.print(a[a.length-1] + " ");
    }
}
