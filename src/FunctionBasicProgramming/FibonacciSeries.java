package FunctionBasicProgramming;

import java.util.Scanner;

public class FibonacciSeries {

        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            System.out.println("how many fibonacci series number : ");
            int num= sc.nextInt();

            displayFibonacciSeries(num);

        }
        static void displayFibonacciSeries(int n){
            int x=1, y=0, z=0, count=1;
            while (count<=n){
                System.out.print(z+"  ");

                z=x+y;
                x=y;
                y=z;
                count++;
            }
        }
    }

