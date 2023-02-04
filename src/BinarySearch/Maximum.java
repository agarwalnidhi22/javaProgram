package BinarySearch;

public class Maximum {
    public static void main(String[] args) {
        int arr[]= {56,58,54,23,14,89};
        int max=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] >max){
                max=arr[i];
            }
        }
        System.out.println("maximum number is :" +max);
    }
}
