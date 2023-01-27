package BinarySearch;
import java.util.*;
public class ScannerBubble {
    public static void main(String[] args) {
        int a[] = new int[10];

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 10 number");

        for(int i=0; i<10; i++){
            a[i]= sc.nextInt();
        }
        for(int i=0; i<10; i++){
            for(int j=0; j<10-i-1; j++){
                if(a[j]>a[j+1]){
                    int temp= a[j];
                    a[j]= a[j+1];
                    a[j+1]= temp;

                }
            }
        }
        for(int i=0; i<10; i++){
            System.out.print(  a[i] +" ");
        }
    }
}
