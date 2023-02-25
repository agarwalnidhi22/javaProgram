package OopsYoutube;
class student{ // super class
    int rollNumber,marks;
    String name;
    void input(){
        System.out.println("Enter rollNumber & marks");

    }
}
class ankit extends  student{ // subClass
    void show(){
        rollNumber=1; name="ankit"; marks=65;
        System.out.println(rollNumber+" "+name+" "+marks);
    }
}
public class SingleInheritence {
    public static void main(String[] args) {
        ankit a1= new ankit();
        a1.input();
        a1.show();

    }
}
