package Youtube;
import java.util.*;
public class You4 {
    public static void main(String[] args){
        int age;
        System.out.println("enter age :    ");
        Scanner sc= new Scanner(System.in);
        age= sc.nextInt();

        switch(age){
            case 18:
                System.out.println("you are going to become adult");
                break;

            case 23:
                System.out.println("You are going to join a job");
                break;
            case 60:
                System.out.println("you are going to retaired");
                break;
            default:
                System.out.println("Enjoy your Life\n You are very younger now");
        }
        System.out.println("thanks for using my java code");
    }
}
