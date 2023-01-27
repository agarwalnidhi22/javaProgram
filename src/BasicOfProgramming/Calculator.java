package BasicOfProgramming;
import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);

        System.out.print("Enter first number : ");
        int num1= sc.nextInt();

        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter required operation [+,-,*,/ : ");
        char operator= sc.next().charAt(0);

        if(operator=='+'|| operator=='-' || operator=='*' || operator=='/') {

            int res = Calculate(num1, num2, operator);
            System.out.println(num1 + " " + operator + " " + num2 + "  =" + res);
        }else{
            System.out.println(" Invalid operation");
        }


        sc.close();
    }
    static int Calculate(int x,int y, char operator){
        int res=0;
        switch(operator){
            case '+':
                res=x+y;
                break;

            case '-':
                res=x-y;
                break;

            case '*':
                res=x*y;
                break;

            case '/':
                res= x/y;
                break;
        }//switch closing
        return res;
    }//method closing
}//class closing
