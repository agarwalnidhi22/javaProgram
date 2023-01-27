package FunctionMethod;

public class FunctionCallFunction1 {
    public static void main(String[] args) {
printNum1(1);

    }
    static void printNum1(int n){
        System.out.println(n);
        printNum2(2);
    }
    static void printNum2(int n){
        System.out.println(n);
        printNum3(3);
    }
    static void printNum3(int n){
        System.out.println(n);
    }
}
