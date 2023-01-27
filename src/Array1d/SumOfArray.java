package Array1d;
import java.util.*;
public class SumOfArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Element in Array");
        for (int i = 0; i <= 4; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i <= 4; i++) {
            System.out.println((a[i] + " "));
            sum = a[i] + sum;
        }
        System.out.println("addition of array :" + sum);
    }
}
