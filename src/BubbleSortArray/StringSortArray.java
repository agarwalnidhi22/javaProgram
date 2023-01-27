package BubbleSortArray;
import java.io.*;
public class StringSortArray {
    public static void main(String[] args) throws IOException{
   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of an array");

        int n= Integer.parseInt(br.readLine());


        String arr[]= new String[n];
        System.out.println("Enter "   + n +  " Names");
        for(int i=0; i<n; i++){
            arr[i]= br.readLine();
        }
        System.out.println("Original Array");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ,");
        }

        //bubble sort
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        System.out.println("Sorted Array");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ,");
        }
    }
}
