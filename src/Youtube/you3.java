package Youtube;
import java.util.*;

public class you3 {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        age = sc.nextInt();
        if (age >= 55) {
            System.out.println("you are Experienced");
        } else if (age >= 45) {
            System.out.println("you are semi Experienced");
        } else if (age > 30) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible and experienced");
        }
    }
}