package FunctionAndMethod;

public class FunctionOverloading {
    public static void main(String[] args) {
//        fun(56);
        fun("Nidhi Agarwal");

    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
