package Array1d;

public class PrimeNumber {
    public static void main(String[] args) {


        int num = 25;
        boolean number = false;
        for (int i = 2; i <= num / 2; i++) {

            if (num % 1 == 0) {
                number = true;
                break;
            }
        }
        if (!number)
            System.out.println(num + " prime number");
        else
            System.out.println(num + " not prime number");
    }
}

