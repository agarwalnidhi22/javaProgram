package Oops1;
import java.util.*;
class we{
    int l,b,h;
    we(){
        l=1;
        b=1;
        h=1;
    }
    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter l ");
        l=sc.nextInt();
        System.out.println("Enter b");
        b= sc.nextInt();
        System.out.println("Enter h");
        h= sc.nextInt();
    }
    void dis(){
        System.out.println(l);
        System.out.println(b);
        System.out.println(h);
    }

    public static void main(String[] args) {
        we w1= new we();
        w1.input();
        w1.dis();


    }
}

