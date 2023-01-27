package BinarySearch;

public class LinearSearchEle {
    public static void main(String[] args) {
        int a[] = {56,21,25,3,1,7};
        boolean flag=false;
        int key=25;
        for(int i=0; i<a.length; i++) {
            if (key == a[i]) {
                System.out.println("Element Found at index number" + " "+ i);
                flag = true;
                break;
            }
        }
            if(flag==false){
                System.out.println("Element not Found");
            }
        }
    }
