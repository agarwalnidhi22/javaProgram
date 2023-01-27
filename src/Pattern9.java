import java.util.*;
public class Pattern9 {
    public static void main(String[] args){
        int i,j,k;
        k=0;
        for(i=1; i<=5; i++){
             if (i<=3) k++; else k--;
            for(j=1; j<=3; j++)
            {
                if(j<=k)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();

        }
    }
}
