package Array1d;
import java.util.*;
public class Function1 {
    public static void main(String[] args) {
        Function1 f1 = new Function1();
        f1.sum();
    }

    void sum(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter two number");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(a+b);
        //no return with no argument
    }

}
