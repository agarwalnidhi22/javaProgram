import java.util.*;
public class Airtmeticcc {
    public static void main(String[] args){
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n=sc.nextInt();
        int a=2;
        for(int i=1; i<=n; i++){
            sum=sum+a;
            a*=3;
        }
        System.out.println("sum :" +sum);

    }
}
