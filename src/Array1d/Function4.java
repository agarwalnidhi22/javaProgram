package Array1d;
import java.util.*;
public class Function4 {
    public static void main(String[] args) {
        Function4 f4= new Function4();
        f4.Area_of_circle();


    }

    void Area_of_circle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");

        int r = sc.nextInt();
        System.out.println(3.14 * r * r);
        // no return no argument

    }
}
