package PeepCoding;
import java.util.*;
public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int inverse =0;
        int original_place= 1;
        while(n!=0){
            int original_digit= n % 10;
            int inverse_digit = original_place;
            int inverse_place = original_digit;

            inverse= inverse + inverse_digit * (int)Math.pow(10, inverse_place-1);
            n=n/10;
            original_place++;
        }
        System.out.println(inverse);
    }
}
