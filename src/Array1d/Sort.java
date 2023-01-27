package Array1d;

public class Sort {
    //insertion sort
    public static void main(String[] args) {
        int[] arr= {9,3,7,5,2};
        int j;
        for(int i=0; i<arr.length; i++){
            int temp=arr[i];
            j=i;

            while(j>0 && arr[j-1]>temp){
                arr[j]= arr[j-1];
                j=j-1;
            }
            arr[j]=temp;
        }
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
