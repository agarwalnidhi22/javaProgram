package Double2DArray;
import java.util.*;
public class Double2d1st {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[][]= new int [5][5];
        int i,j;

        System.out.println("Enter a number");
        for(i=0;i<=5; i++){
            for(j=0; j<=5; j++){
                a[i][j]= sc.nextInt();
            }
        }
        for(i=0;i<=5; i++){
            for(j=0; j<=5; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
