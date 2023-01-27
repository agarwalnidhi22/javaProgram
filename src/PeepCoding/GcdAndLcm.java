package PeepCoding;
import java.util.*;
public class GcdAndLcm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int number1= sc.nextInt();
        int number2= sc.nextInt();

        int original_number1= number1;
        int original_number2= number2;

        while(number1 % number2!=0){
            int rem = number1 % number2;
            number1= number2;
            number2= rem;
        }
        int gcd = number2;
        int lcm = (number1 * number2)/ gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
