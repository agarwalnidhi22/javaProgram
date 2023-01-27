package Array1d;

public class Array1Program {
    public static void main(String[] args) {
        //question--> classroom of 5 students. you have to store marks of 5 students.
        //there are three ways to create an array in java

        //1. declaration and then memory allocation
       /* int marks[];
        marks = new int[5];
        marks[0]= 56;
        marks[1]= 65;
        marks[2]= 89;
        marks[3]= 88;
        marks[4]= 32;
        System.out.println(marks[3]); */

        //2. declaration + memory allocation
         /* int marks[]= new int[5];
         marks[0]= 66;
         marks[1]= 65;
         marks[2]= 55;
         marks[3]= 88;
         marks[4]= 74;
        System.out.println(marks[2]); */

        //3. declaration + initialization

        int marks[]= {56,25,98,87,54};
        System.out.println(marks[2]);





    }
}
