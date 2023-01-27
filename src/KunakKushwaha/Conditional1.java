package KunakKushwaha;
import java.util.*;
public class Conditional1 {
    public static void main(String[] args) {
        int salary= 25000;

        if(salary>10000){
            salary=salary+2000;
        }else if (salary>20000){

            salary=salary+3000;
        }
        else if(salary>40000){
            salary=salary+4000;
        }
        else
        {
            salary=salary+1000;
        }
        System.out.println(salary);



    }
}
