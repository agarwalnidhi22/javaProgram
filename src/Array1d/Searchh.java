//package Array1d;
//
//public class Searchh {
//    public static void main(String[] args) {
//
//        int count = 0;
//        int a[] = {5,6,9,8,2,1};
//    ;
//
//        int key = 5;
//
//        int l = 0;
//        int r = a.length - 1;
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length - 1 - i; j++) {
//                if (a[j] > a[j + 1]) {
//                    int temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = temp;
//                }
//            }
//
//        }
//        //binary search
//        while (l <= r) {
//            int mid = (l + r) / 2;
//
//            if (a[mid] == key) {
//                count++;
//                break;
//            } else if (a[mid] < key) {
//                l = mid + 1;
//            } else {
//                r = mid - 1;
//            }
//            if (count == 1)
//                System.out.println("present");
//            else
//                System.out.println("Not present");
//        }
//    }
//}