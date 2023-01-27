package FunctionAndMethod;
import java.util.*;
public class Function4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

         CalculateFactorial(n);

    }
    public static void CalculateFactorial(int n){
        if(n<0) {
            System.out.println("Invalid Statement");
            return;
        }
       int factorial=1;

        for(int i=n; i>=1; i--) {
            factorial = factorial * i;

        }
        System.out.println(factorial);
            return;
        }
    }
