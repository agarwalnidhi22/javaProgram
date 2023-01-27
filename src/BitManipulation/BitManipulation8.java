//package BitManipulation;
//
//public class BitManipulation8 {
//    //question --> power of 4 or not
//    // input--> 4
//    // output--> true
//    public static void main(String[] args) {
//        int num=4;
//        boolean ans = isPowerOf4(num);
//        System.out.println(ans);
//
//
//    }
//    public static boolean isPowerOf4(int num){
//        // we will cheq the number is power of 2 or not
//        boolean conditionOfPowerOf2=(num & num-1)==0;
//        boolean conditionWithMask = ((0*5555555 & num)!=0);
//
//        return  num>0 && ((num & num-1)==0 && (0*5555555 & num)!=0);
//        return (num>0 && conditionOfPowerOf2 && conditionWithMask);
//    }
//}
