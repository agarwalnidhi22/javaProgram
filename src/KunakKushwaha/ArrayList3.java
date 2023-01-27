package KunakKushwaha;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list3= new ArrayList<>();
        for(int i=0; i<5; i++){
            list3.add(sc.nextInt());
        }
        for(int i=0; i<5; i++){
            System.out.println(list3.get(i));
        }

    }
}
