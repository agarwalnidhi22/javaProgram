package BinarySearch;

public class ThirdHighestArray {

    public static  int thirdLargest(int[] arr, int total){
        int temp=0;
        for(int i=0; i<total; i++){
            for(int j=i+1; j<total; j++){
                if(arr[i]<arr[j]){
                    //swap
                    temp=arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        return  arr[total-3];
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 4};
        System.out.println("third largest element is :" + thirdLargest(arr,7));
    }
}
