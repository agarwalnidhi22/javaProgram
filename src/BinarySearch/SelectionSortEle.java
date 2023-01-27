package BinarySearch;

public class SelectionSortEle {
    public static void main(String[] args) {
        int a[] = {56,25,32,25,87,56};

        for(int i=0; i<a.length; i++){
            int min=i;
            for(int j=i+1; j<a.length; j++){

                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp= a[i];
            a[i]= a[min];
            a[min]=temp;
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
