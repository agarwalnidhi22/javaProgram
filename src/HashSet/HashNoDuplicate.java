package HashSet;

import java.util.HashSet;

public class HashNoDuplicate {
    //question--> given a list make sure there is no duplicate element
    //input--> [1,2,3,4,6,7,90,1,4,91,3,27,24,3,22,3,12,11,10,9,70,63,70,72]
    //output--> [1,2,3,4,6,7,90,91,27,24,22,12,11,10,9,70,63,72]

    public static void main(String[] args) {

        int[] arr= new int[]{1,2,3,4,6,7,90,1,4,91,3,27,24,3,22,3,12,11,10,9,70,63,70,72};
        removeDuplicate(arr);
    }
    public static void removeDuplicate(int arr[]){
        HashSet set= new HashSet();
        for(int i=0; i<arr.length; i++){
            int item= arr[i];
            set.add(item);
        }
        System.out.println(set);
    }
}