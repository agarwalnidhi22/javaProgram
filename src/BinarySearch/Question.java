package BinarySearch;

public class Question {
    public static void main(String[] args) {
        int[] arr = {100, 90, 80, 70, 60, 50};

        int value = 90;
        boolean flag = false;

        for (int i = 0; i < arr.length-1; i++) {
            if (value == arr[i]) {
                System.out.println("element found  at:" + i);
                flag = true;
                break;

            }
        }
        if (flag == false) {
            System.out.println("element not found");
        }
    }
}