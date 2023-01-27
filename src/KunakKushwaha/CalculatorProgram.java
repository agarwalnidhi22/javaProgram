package KunakKushwaha;
import java.util.*;
public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        while (true) {
            char op = sc.next().charAt(0);

            System.out.print("Enter the operation");

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.print("Enter two number");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                    if (op == '%') {
                        ans = num1 % num2;
                    }
                } else if (op == 'x' || op == 'X') {
                    break;
                } else {
                    System.out.print("invalid");
                }
            }
            System.out.println(ans);
        }
    }
}