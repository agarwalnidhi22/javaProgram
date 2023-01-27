package FunctionAndMethod;

import java.util.Arrays;

public class FunctionOverloading2 {
    public static void main(String[] args) {
//      demo("Nidhi", "Nidhii");
        demo(1,32,56);
    }
    static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String...n){
        System.out.println(Arrays.toString(n));
    }
}
