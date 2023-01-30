package Recursion1;

public class DecreasingOrder {
    public static void main(String[] args) {
        printDecreasing(5);
    }
    public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printDecreasing(n-1);
    }
}
