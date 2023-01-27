package Array1d;

public class minimum {
    public static void main(String[] args) {
        int arr[] = {38, 58, 56, 2, 99};
        boolean flag = false;
        int key = 3;
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == key) {
                System.out.println("element found");
                flag = true;
                break;
            }
            if (arr[m] < key) {
                l = m + 1;
            }
            if (arr[m] > key) {
                r = m - 1;
            }
        }
        if (flag == false) {
            System.out.println("element not found");
        }
    }
}


