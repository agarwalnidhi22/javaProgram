package BitManipulation;

public class BitManipulation4 {
    //question-->right most set bit
    //input--> 684 --> 1 0 1 0 1 0 1 1 0 0
    //output--> 4
    // hint --> take 2's complement and do & operator
    public static void main(String[] args) {
        int num=684;
        int ans= rightMostSetBit(num);
        System.out.println(ans);


    }
    public static int rightMostSetBit(int num){
        int numComplement = ~num;
        int twoComplement = numComplement+1;
        return num & twoComplement;
    }
}
