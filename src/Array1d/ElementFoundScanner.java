package Array1d;
import java.util.*;
public class ElementFoundScanner {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a element");
        for (int i = 0; i <= 4; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Search element");
        int searchElement = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= 4; i++) {
            if (searchElement == a[i])
                count++;
            if (count == 1) {
                System.out.println("Element found");
            } else {
                System.out.println("Element not found");
            }
        }
    }
}

