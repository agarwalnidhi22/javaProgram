package PeepCoding;
import java.util.*;
public class RotateANumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //element --> 23457
        //1st rotation --> 72345
        //2nd rotation --> 57234
        //3rd rotation --> 45723
        //4th rotation --> 34572
        // 23457

        int n= sc.nextInt();
        int k= sc.nextInt();

        int temp= n;
        int no_Of_Digit =0;
        while(temp>0){
            temp= temp/10;
            no_Of_Digit ++;
        }
        k= k % no_Of_Digit;
        if(k<0){
            k= k + no_Of_Digit;
        }
        int div =1;
        int multiplication=1;

        for(int i = 1; i<= no_Of_Digit; i++){
            if(i<=k){
                div= div*10;
            } else {
                multiplication= multiplication*10;
            }
        }
        int q= n / div;
        int r= n % div;
        int rotation =  r* multiplication + q;
        System.out.println(rotation);
    }
}
