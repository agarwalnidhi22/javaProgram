package StringProgramm;

public class ReverseStringSb8 {
    public static void main(String[] args){
        StringBuilder sb= new StringBuilder("Agarwal");

        for(int i=0; i<sb.length()-1-i; i++){

            int front=i;
            int back= sb.length()-1-i;

            char frontChar= sb.charAt(front);
            char backChar= sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);

    }
}
