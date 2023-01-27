package Array1d;
import java.util.*;
public class SearchElement {
    public static void main(String[] args){
        int a[]= new int[5]; int n;  int count=0;
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<a.length; i++){
            a[i]= sc.nextInt();
        }
        System.out.print("Array Element");
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]+ " ");
        }
        System.out.println("Enter Search Element");
         n=sc.nextInt();
        for(int i=0; i<a.length; i++){
            if( a[i]== n){
                count++;
            }
        }
        if(count>0)
            System.out.println("Element Found");
        else System.out.println("Element Not Found");


    }
}
