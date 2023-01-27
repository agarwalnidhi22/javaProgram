package FunctionMethod;
import java.util.*;
public class SwapNumber {
    public static int SwapTwoNumber(int a,int b){
       int temp=a;
       a=b;
       b=temp;
        System.out.println("a swap :" +a);
        System.out.println("b swap :" +b);
  return 1;
    }
    public static void main(String[] args){

        int a=5;
        int b=10;
        int Swap=SwapTwoNumber(a,b);

    }
}
