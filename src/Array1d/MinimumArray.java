package Array1d;
import java.util.*;
public class MinimumArray {
    public static void main(String[] args){
        int a[] = new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a Element");

        for(int i=0; i<=4; i++){
            a[i]= sc.nextInt();
        }
        int max=a[0];
        int min=a[0];
        for(int i=0; i<=4; i++){
            if(max<a[i]) {
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }

        }
        System.out.print( "max : " +max+ ",min :"+ min );

    }
}
