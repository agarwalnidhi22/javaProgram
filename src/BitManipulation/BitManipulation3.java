package BitManipulation;

public class BitManipulation3 {
    //question--> flipped 4th bit
    //input--> 181
    //output--> 165
    //hint--> xor operator
    public static void main(String[] args) {
        int num = 181;
        int ans= compulsory4bitflip(num,4);
        System.out.println(ans);



    }
    public static int compulsory4bitflip(int num,int position){
        int mask = 1<<position;
        return mask ^ num;
    }
}
