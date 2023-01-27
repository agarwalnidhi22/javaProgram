package FunctionAndMethod;
import java .util.*;

public class F1Sum {
    public  static void main(String[] args){
        CalculateSum();
        int ans=CalculateSum2();
        System.out.println(ans);
    }

    static int CalculateSum2(){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int sum= a+b;
        return  sum;
    }
    static void CalculateSum(){
        Scanner sc= new Scanner (System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum=a+b;
        System.out.print(sum);
    }
}
