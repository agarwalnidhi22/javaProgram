package KunakKushwaha;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList <Integer> list1=new ArrayList<>();
        list1.add(64);
        list1.add(5);
        list1.add(99);
        list1.add(85);

        System.out.println(list1.contains(6));
        System.out.println(list1.set(0,90));
        System.out.println(list1);
    }
}
