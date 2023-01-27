package FunctionBasicProgramming;

import java.util.Scanner;

public class Factorial {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Which number's factorial :");
            int num = sc.nextInt();

            int fact = Program(num);
            System.out.println(fact);
        }

        static int Program(int n) {
            int fact = 1;
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }

