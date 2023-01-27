package Array1d;
import java.util.*;
public class PrintArrayElement {
    public static void main(String[] args){
        int a[] = new int[5];
        System.out.print("Enter an Array Element");
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<=4;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<=4; i++){
            System.out.print(a[i] +" ");
        }
    }
}
