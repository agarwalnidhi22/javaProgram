package BitManipulation;

public class BitManipulation6 {
    //question --> find out one non repeating element in repeating Array
    // input --> [2,3,5,7,3,5,7]
    //output --> 2

    public static void main(String[] args) {
        int num[] = {2,3,5,7,3,5,7};
        int ans= nonRepeatingNum(num);
        System.out.println(ans);


    }
    public static int nonRepeatingNum(int[] arr){
        int ans=0;
        for(int i=0; i<arr.length; i++){
            ans= ans ^ arr[i];

        }
        return ans;
    }
}
