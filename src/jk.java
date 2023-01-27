import java.util.Scanner;

public class jk {
    public static void main(String[] args){
        double sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        int m=9;
        for(int x=1; x<=n; x++ ){
            sum=sum+Math.pow(m,2) ;
            m=m+4;
        }
        System.out.println("sum:" + sum);
    }
}
