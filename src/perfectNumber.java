import java.util.Scanner;

public class perfectNumber {


        public static  void main(String[] args){
            int n, s = 0, m, i;
            Scanner sc =  new Scanner(System.in);
            n= sc.nextInt();
            m=n;
            for(i = 1; i <= n-1; i++){
                if(n % i == 0)
                    s = s + i;
            }
            if(n == s)
                System.out.println("perfect number");
            else
                System.out.println("not perfect number");
        }
    }


