package BinarySearch;

public class Minimum {
    public static void main(String[] args) {
        int arr[] = {56,25,87,23,65};
        int min=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] <min){
                min= arr[i];
            }
        }
        System.out.println("minimum element is :" +min);
    }
}
