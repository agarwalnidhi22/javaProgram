import java.util.*;
public class AirthmeticSeries3 {
    public static void main(String[] args){
        double sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n=sc.nextInt();
        int x=sc.nextInt();

        a=1;
        for(int i=1; i<=n; i++){
            a+=2;
            sum=sum+ Math.pow(a,3/x);

        }
        System.out.println("sum ": +sum);
    }
}
