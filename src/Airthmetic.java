import java.util.*;
public class Airthmetic {
    public static void main(String[] args){
        double sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        for(int x=1; x<=n; x++ ){
            sum=sum+Math.pow(x,x)    ;
        }
        System.out.println("sum:" + sum);
    }

}
