package OopsYoutube;

//public class Parameterized {
class c{
    int x, y;
    int m; String n;
    c(int a, int b){ // parameterized constructor
        x=a;
        y=b;
    }
    c(int a1, String b1){
        m=a1;
        n=b1;
    }
    void show(){
        System.out.println(x+" "+y);
        System.out.println(m+" "+n);
    }
}
  class  d{
      public static void main(String[] args) {
          c c1= new c(100,200);
          c1.show();
          c c2= new c(101 ,"nidhi");
          c2.show();

      }
  }
