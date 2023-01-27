package FunctionAndMethod;
import java.util.*;
public class Function7 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        CalculateGreatestNum(a,b);

    }
    public static boolean CalculateGreatestNum(int a, int b){

        if(a>b){
            System.out.println("grater");
            return true;

        }
        else{
            System.out.println("lesser");
            return  false;
        }
    }
}
