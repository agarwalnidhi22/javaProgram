package PeepCoding;
public class Swap {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static void main(String[] args) {
        int[] arr= new int[5];

        arr[0]= 33;
        arr[1]= 56;
        arr[2]= 55;
        arr[3]= 25;
        arr[4]= 21;

        swap(arr,0,4);

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }

    }
}
