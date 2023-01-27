package PeepCoding;
import java.util.*;
public class FindElement {
    //Sorted Array
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int[] arr= new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int search_element= sc.nextInt();
        int idx=-1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == search_element){
                idx=i;
                break;
            }
        }
        System.out.println(idx);
    }
}
