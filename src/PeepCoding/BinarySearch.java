package PeepCoding;
import java.util.*;
public class BinarySearch {


    public static void main(String[] args) {


            int count=0;
            int a[]= {6,5,8,9,2,3};

            int key=50;

            int l=0;
            int r=a.length-1;
//Array Sorted
            for(int i=0; i<=a.length-1; i++){
                for(int j=0; j<a.length-1-i; j++){
                    if(a[j]>a[j+1]){
                        int temp= a[j];
                        a[j]= a[j+1];
                        a[j+1]= temp;
                    }
                }
            }
            //Binary Search
            while(l<=r){
                int mid=(l+r)/2;

                if(a[mid]==key){
                    count++;
                    break;
                }
                else if(a[mid]<key){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
            if(count==1)
                System.out.println("Element found");
            else
                System.out.println("Element not found");

        }
    }




