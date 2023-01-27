package SelectionSortt;

public class Selection {
    public static void main(String[] args) {
        int[] arr={52,6,25,45,3,8};
        int min;

        for(int i=0; i<arr.length; i++){
            min=i;

            for(int j=i+1; j<arr.length; j++){

                if(arr[j]<arr[min]){
                    min =j;
                }
            }
           int temp= arr[i];
            arr[i]= arr[min];
            arr[min]= temp;

        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }

    }
}
