package OopsYoutube;
//
//public class CopyConstructor {
class e{
    int a; String b;
    e(){
        a=10;
        b="Nidhi";
        System.out.println(a+" "+b);
    }
     e(e ref){
        a= ref.a;
        b=  ref.b;
        System.out.println(a+" "+b);

    }
}
   class f{
       public static void main(String[] args) {
           e e1= new e();
           e e2= new e(e1);
       }
   }
