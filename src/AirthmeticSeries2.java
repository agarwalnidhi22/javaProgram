import java.util.*;
public class AirthmeticSeries2 {
    public static void main(String[] args){
        double sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=1;
        int n= sc.nextInt();
        int x=sc.nextInt();
        for(int i=1; i<=n;i++){

            sum=sum+Math.pow(a,3)/x;
            a+=2;

        }
        System.out.println("sum :" +sum);
    }
}
