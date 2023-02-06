package HashSet;
import java.util.HashSet;

public class HashDuplicate {
    //question --> find out the duplicate in list
    //input-->1,2,3,4,5,6,7,8,9,10,90,3,12,15,17,100,12,2
    //output--> 3
    public static void main(String[] args) {
        int[] arr= new int[] {1,2,3,4,5,6,7,8,9,10,90,3,12,15,17,100,12,2};
        int answer= findDuplicate(arr);
        System.out.println(answer);
    }
    public static int findDuplicate(int[] arr) {
        HashSet set = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return arr[i];
            } else {
                set.add(arr[i]);
            }
        }
        return -1;
    }
}