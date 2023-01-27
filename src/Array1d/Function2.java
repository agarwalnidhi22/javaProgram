package Array1d;
import java.util.*;
public class Function2 {
    public static void main(String[] args) {
        Function2 f2= new Function2();
        f2.multiply();

    }
    void multiply(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(a*b);

    }
}
