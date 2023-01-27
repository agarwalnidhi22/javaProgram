package Array1d;
import java.util.*;
public class PrintArray {
    public static void main(String[] args){
        int size,i;
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter element");
        size=sc.nextInt();
        int a[]= new int[size];

        for(i=0;i<size; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Prited Element");
        for(i=0;i<size; i++){
            System.out.println(a[i]+" ");
        }
    }
}
