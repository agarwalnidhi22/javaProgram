package IncomeTax;

import java.util.Scanner;

public class SalaryTax {
    // 2.5l -5.0l => 5%
    // 5.0l - 10.0l=> 20%
    //above 10.0l => 30%

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Income");
        float tax=0;
        float income= sc.nextInt();

        if(income<=2.5){
            tax=tax+0;
        }else if(income>=2.5f && income<=5.0f){
            tax= tax+0.05f*(income-2.5f);
        }
        else if(income>=5.0f && income<=10.0f){
           tax=tax+0.05f*(income-2.5f);
            tax= tax+0.20f*(income-5.0f);
        }
        else if(income>=10.0f){
            tax=tax+0.05f*(income-2.5f);
            tax=tax+0.20f*(income-5.0f);
            tax= tax+0.30f*(income-10.0f);
        }
        System.out.println("The Total Tax Paid By the emplayee is: "  +tax);
    }

}
