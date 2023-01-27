import java.util.*;
public class passFail {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Number");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        if(a>45 && b>45 && c>45)
        System.out.println("Pass");
        else
        System.out.println("Fail");
    }
}
