package BinarySearch;

public class LinearElement {
    public static void main(String[] args) {
        int a[] = {10,20,40,30,50,70,60};
        int search_element= 50;
        boolean flag=false;

        for(int i=0; i<a.length; i++){

            if (search_element==a[i]){
                System.out.println("Element found at : " +i);
                flag=true;

                break;
            }
        }
        if(flag==false){
            System.out.println("Element Not Found");
        }


    }
}
