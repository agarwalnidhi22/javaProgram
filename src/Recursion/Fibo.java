package Recursion;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(Fibonacci(6));

    }
    static int Fibonacci(int n){

        //base condition
        if(n<2) {
            return n;
        }
    return Fibonacci(n-1)+ Fibonacci(n+2);

}
}
