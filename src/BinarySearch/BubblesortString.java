package BinarySearch;
import java.util.*;
public class BubblesortString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n= sc.nextInt();

        String a[] = new String[n];
        System.out.println(" enter " + n + " Names ");

        for(int i=0; i<n; i++){
            a[i]= sc.nextLine();

        }
        for (int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(a[j].compareTo(a[j+1])>0){
                    String temp = a[j];
                    a[j]= a[j+1];
                    a[j+1]= temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(a[i]+" ");
        }

    }

}
