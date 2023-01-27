package BitManipulation;

// Question 5bit always unset
// input 181 -->  10110101
// output 165 --> 10100101
public class BitManipulation2 {
    public static void main(String[] args) {
        int num=181;
        int ans= compulsory4bit0(num,4);
        System.out.println(ans);

    }
    public static int compulsory4bit0(int num, int position){
        int mask= 1 << position;
        mask= ~mask;
        return mask & num;
    }
}
