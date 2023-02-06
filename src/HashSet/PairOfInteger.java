package HashSet;

import java.util.HashSet;

public class PairOfInteger {
    //question--> find out the pair of integer equals to the target
    // Target --> 10
    //input--> [1,2,3,4,5,6,7,8,9]
    // output-->  [4]
    //explaination--> (9,1) (6,4) (7,3) (8,2)

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            int ans= countsPairOfSumTarget(arr, 10);
        System.out.println(ans);
    }
    public static int countsPairOfSumTarget(int[] arr, int target) {
        int count=0;
        HashSet set = new HashSet();
        for(int i=0; i<arr.length; i++){
            int item=arr[i];
            int otherNumber= target- item;

            if(set.contains(otherNumber)){
                count++;
                set.add(item);
            }else{
                set.add(item);
            }
        }
        return count;
    }
}
