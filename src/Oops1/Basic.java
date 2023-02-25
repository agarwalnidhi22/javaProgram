package Oops1;
import java.util.Scanner;
    class basic { // member variable
        String name, address;
        int phoneNumber;

        void inputData() { // member function
            Scanner sc = new Scanner(System.in);
            System.out.println("enter name");
            name = sc.next();
            System.out.println("Enter address");
            address = sc.next();
            System.out.println("Enter Phone number");
            phoneNumber = sc.nextInt();
        }

        void display() {
            System.out.println(name);
            System.out.println(address);
            System.out.println(phoneNumber);
        }

        public static void main(String[] args) {
            basic b1= new basic();
            b1.inputData();
            b1.display();

        }
    }

