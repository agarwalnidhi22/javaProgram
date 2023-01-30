package Recursion1;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=13;
        boolean ans= isPrime(n);
        System.out.println(ans);

    }
    public static boolean isPrime(int n){
        //stopping
        if(n<2){
            return false;
        }
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return  true;
    }
}
