package OopsYoutube;

//public class Constructor {
      class  A{
    int a; String name; // instance variable
    A(){
    a=1; name= "nidhi"; // Default constructor

    }
    void show(){
        System.out.println(a+ " "+name);
    }
}
   class B{
       public static void main(String[] args) {
           A a1= new A();
           a1.show();
       }
   }
