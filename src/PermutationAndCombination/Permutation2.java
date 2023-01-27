package PermutationAndCombination;

public class Permutation2 {
    public static void main(String[] args) {
        int[] nums ={1,2,3};
        printPermutation("abc", "");
    }



    public static void printPermutation(String str, String ans) {
//        base case /// ....

        if(str.length() == 0) {
            System.out.println(ans);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // a

            String leftSubstring = str.substring(0, i);
            String rightSubstring = str.substring(i+1);
            String restOfTheString = leftSubstring + rightSubstring; // bc

            printPermutation(restOfTheString, ans + ch);
        }
    }
}
