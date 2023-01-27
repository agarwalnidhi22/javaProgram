package BubbleSortArray;

import java.util.Arrays;

public class FunctionInteger {
    public static void main(String[] args) {
        int[] arr={66,21,56,65,89,20};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int flag=0;
            for(int j=0; j<arr.length-1-i; j++){

                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                    flag=1;

                }
            }
            if(flag==0){
                break;
            }
        }

    }
}
