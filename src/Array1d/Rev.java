package Array1d;
import java.util.*;
public class Rev {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
       int reverse=0;
       while(n!=0){
           reverse= reverse*10 + n%10;
           n= n/10;
       }
        System.out.println("reverse number is : "+ reverse);
    }
}
