package Array2D;
import java.util.*;
public class Transpose {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many rows you want");
        int r= sc.nextInt();
        System.out.println("Enter how many column you want");
        int c=sc.nextInt();
        int i;
        int a[][]= new int[r][c];
        System.out.println("Enter "+(r*c));

        for( i=0; i<r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
            System.out.println("Original Matrix is: ");
            for( i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Transpose Matrix is: ");
            for( i=0; i<c; i++){
                for(int j=0; j<r; j++){
                    System.out.print(a[j][i]+" ");
                }
                System.out.println();
            }
        }
    }
