import java.util.*;
public class armstrongNumber {
    public static void main(String[] args){
        int n,s=0,r,m;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");

         n = sc.nextInt();
        m=n;
        while(n>0)
        {
            r=n%10;
            s=s+r*r*r;
            n=n/10;
        }
        if(s==m)
            System.out.println("armstrong number");
        else
            System.out.println("not armstrong");
    }
}
