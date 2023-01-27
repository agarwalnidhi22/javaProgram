package Array1d;
import java.util.*;
public class Maximum {
    public static void main(String[] args){
        int a[] = new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Element");
        for(int i=0; i<=4; i++){
            a[i]= sc.nextInt();
        }
        int max=a[0];
        for(int i=1; i<=4; i++){
            if(max<a[i])
            {
            max=a[i];
            }
        }
        System.out.println("Maximum number " +max);
    }
}
