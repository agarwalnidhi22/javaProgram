package BinarySearch;
import java.util.*;
public class BubbleSortEle {
    public static void main(String[] args) {
//        Scanner sc=  new Scanner(System.in);
//        System.out.println("Enter 5 number");
//        int a[]= new int[5];
//
//        for(int i=0; i<=4; i++){
//            a[i]= sc.nextInt();
       int[] a={5,4,2,9,6};
       int n= a.length;


        for(int i=0; i<a.length-1; i++){
            for(int j=0; j<a.length-1-i; j++){
                //Ascending order
                if(a[j]>a[j+1]){
                    int temp= a[j];
                    a[j]= a[j+1];
                    a[j+1]= temp;
                }
            }
        }
        System.out.println("sorted array");

            System.out.print(Arrays.toString(a));
        }
    }
