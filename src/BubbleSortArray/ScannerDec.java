
package BubbleSortArray;
import java.util.*;

public class ScannerDec {
    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 10 element");

        for(int i=0; i<10; i++) {
            a[i] = sc.nextInt();
        }
//            System.out.println("Unsorted array");
////        for(int i=0; i<10; i++){
//            System.out.println(a[i] + " ");
//        }
        for(int i=0; i<10-1; i++){
            int flag=0;
            for(int j=0; j<10-i-1; j++){
                if(a[j]>a[j+1]){
                    int temp= a[j];
                    a[j]= a[j+1];
                    a[j+1]= temp;
                    flag =1;

                }
            }
            if(flag==0){
                break;
            }
        }
        for(int i=0; i<10; i++){
            System.out.print(a[i]+ " ");
        }
    }
}

