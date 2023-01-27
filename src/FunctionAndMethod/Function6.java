package FunctionAndMethod;
import java.util.*;
public class Function6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        CalculateOddNumber(n);

    }

    public static void CalculateOddNumber(int n) {

        for (int i = 1; i <= n; i++) {
            if (n % 2 != 0) {
                System.out.println("odd number");
            } else {
                System.out.println("Even number");

            }
            return;
        }
    }
}