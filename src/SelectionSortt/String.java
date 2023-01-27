package SelectionSortt;

public class String {
    public static void main(java.lang.String[] args) {

        java.lang.String a[]= {"NIDHI", "SHALU", "AMRITA" , "SHONA" , "MOHIT"};
        int min;
        for(int i=0; i<a.length; i++){
            min= i;
            for(int j=i+1; j<a.length; j++){

                if(a[j].compareTo(a[min])<0){

                    min=j;

                }
            }
            java.lang.String temp= a[i];
            a[i]= a[min];
            a[min]= temp;
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] +" ");
        }
    }
}

