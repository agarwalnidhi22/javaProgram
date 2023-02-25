package Recursion1;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                System.out.println(fibonacci(n));
            }

            private static int fibonacci(int n) {
                if(n==0){
                    return 0;
                }
                if (n==1 || n==2){
                    return 1;
                }
                int faith1 = fibonacci(n-1);
                int faith2 = fibonacci(n-2);
                int ans = faith2+faith1;
                return ans;
            }
        }
