package BubbleSortArray;

import java.util.Arrays;

public class FunctionInteger2 {
    public static void main(String[] args) {
        int[] arr={21,23,50,2,36,48};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void Bubble(int[] arr){
        for(int i=0; i<arr.length; i++){
            int flag=0;
            for(int j=0; j<arr.length-i-1; j++){

                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
    }
}
