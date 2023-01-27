package FunctionAndMethod;
import java.util.*;
public class Function2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum=0;

         sum= CalculateSum(a,b);
        System.out.println(sum);

    }
    public static int CalculateSum(int a, int b){
        int sum=a+b;

        return sum;
    }

}
