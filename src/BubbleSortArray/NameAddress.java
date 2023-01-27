//package BubbleSortArray;
//import java.io.*;
//public class NameAddress {
//    public static void main(String[] args) throws IOException{
//        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter the size of an array");
//
//        int size= Integer.parseInt(br.readLine());
//
//        String  name = br.newString[size];
//        String address = br.newString[size];
//
//        System.out.println("Enter name and address of" + n + "person");
//        for(int i=0; i<size; i++){
//           name[i]= br.readLine();
//           address[i]= br.readLine();
//
//           //bubble sort
//            for(int i=0; i<size-1; i++){
//                for(int j=0; j<size-i-1; j++){
//
//                    if(name[j].compareTo(name[j+1])){
//                        //swap name
//                        String temp= name[j];
//                        name[j]= name[j+1];
//                        name[j+1]= temp;
//
//                        //swap address
//                        String temp1= address[j];
//                        address[j]= address[j+1];
//                        address[j+1]= temp;
//                    }
//                }
//            }
//            System.out.println("\n name \t address");
//            for(int i=0; i<n; i++){
//                System.out.println(name[i] + "\t" address[i]);
//            }
//        }
//
//    }
//}
