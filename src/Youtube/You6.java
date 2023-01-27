package Youtube;
import java.util.*;

public class You6 {
    public static void main(String[] args){
        byte m1,m2,m3;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Marks In Physics");
        m1=sc.nextByte();
        System.out.println("Enter Your Marks Math's");
        m2=sc.nextByte();
        System.out.println("Enter Your Marks Hindi");
        m3=sc.nextByte();
         float avg= (m1+m2+m3)/3.0f;
        System.out.println("Your overall Percentage is: " +avg);

        if(avg>40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations! You Have Been Promoted ");
        }
        else{
            System.out.println("Sorry! You have not been Promoted! Please Work Hard");
        }
    }
}
