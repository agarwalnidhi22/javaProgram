package BasicOfProgramming;

import java.util.Scanner;

public class TablePrint {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number and print Table");
            int a = sc.nextInt();

            int i = 1;
            do {
                System.out.println(a * i);
                i++;
            }
            while (i <= 10);
        }
    }
