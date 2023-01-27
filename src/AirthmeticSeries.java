import java.util.Scanner;
public class AirthmeticSeries {
    public static void main(String[] args){
    double sum=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n= sc.nextInt();
    int x= sc.nextInt();
    int a =2;
    for(int i=1; i<=n;i++){
        sum=sum+Math.pow(a,x) ;
        a+=2;
    }
    System.out.println("sum:" + sum);
}
}

