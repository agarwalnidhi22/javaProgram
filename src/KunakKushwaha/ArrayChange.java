package KunakKushwaha;

import java.util.Arrays;

public class ArrayChange {
    public static void main(String[] args) {
        int[] nums= {3,4,5,8,9};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] nums){
        nums[0]= 99;
    }
}
