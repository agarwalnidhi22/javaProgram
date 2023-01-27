//package BitManipulation;
//
//public class BitManipulation7 {
//    //question--> find out 2 non repeating element in repeating Array
//    // input--> [21,22,22,23,24,23]
//    //output--> 21,24
//    public static void main(String[] args) {
//        int num[] ={21,22,22,23,24,23 };
//        int ans[]= twoNonRepeatingNum(num);
//        System.out.println(ans[0]+ " "+ ans[1]);
//
//
//    }
//    public static int twoNonRepeatingNum(int[] arr){
//        int xorNum=0;
//        for(int i=0; i< arr.length; i++){
//            xorNum = xorNum ^ arr[i];
//        }
//        int rightMostSetBit= xorNum & -xorNum;
//
//        int group1=0;
//        int group2=0;
//
//        for(int i=0; i<arr.length; i++) {
//            int val = arr[i];
//            if ((val & rightMostSetBit) == 0) {
//
//                group1 = group1 ^ val;
//            } else {
//                group2 = group2 ^ val;
//            }
//        }
//        return  new int[]{group1,group2};
//
//    }
//
//}
