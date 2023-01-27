package BitManipulation;

public class BitManipulation1 {
    //question 4bit always set
    //input 181 --> 10110101
    //output 189--> 10111101
    public static void main(String[] args) {
        int num=181;
        int ans= compulsory3bit1(num,3);
        System.out.println(ans);

    }
    public static int compulsory3bit1(int num,int position){
        int mask = 1<<position;
        return mask|num;

    }
}
//tc--> O(1)
//sc--> O(1)