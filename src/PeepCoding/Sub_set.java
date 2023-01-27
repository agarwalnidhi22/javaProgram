package PeepCoding;
import java.util.*;
public class Sub_set {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int[] arr= new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int limit=(int)Math.pow(2, arr.length);

        for( int i=0; i<limit; i++){
            String sub_set = " ";
            int temp=i;
            //convert i to binary and use 0 and 1

            for(int j=arr.length-1;  j>=0; j--){
                int r = temp % 2;
                temp= temp/2;

                if(r==0){
                    sub_set ="- \t" + sub_set;
                } else {
                    sub_set = arr[j] +"\t" + sub_set;
                }
            }
            System.out.println(sub_set);
        }
    }
}
