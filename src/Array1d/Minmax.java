package Array1d;

public class Minmax {
    public static void main(String[] args) {
        int arr[]= {20,30,54,65,85};
        int max=arr[0];
        for(int i=1; i<=arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum number in array is : "+max);
    }
}
