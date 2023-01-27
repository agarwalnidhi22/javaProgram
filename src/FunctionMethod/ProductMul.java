package FunctionMethod;
import java.util.*;
public class ProductMul {
    public static int Multiplication(int a,int b){
        int product=a*b;
        return product;

    }


    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int product= Multiplication(a,b);
        System.out.println("multiplication is : "+ product);

    }
}
