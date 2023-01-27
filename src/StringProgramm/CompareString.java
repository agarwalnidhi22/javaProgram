package StringProgramm;

public class CompareString {
    public static void main(String[] args){

        String name1 = "nidhi";
        String name2 = "vidhi";

        //s1>s2 => +ve value
        //s1<s2 => -ve value
        // s1==s2=> equal

       if(name1.compareTo(name2)==0){
           System.out.println("string are equal");
        }else{
           System.out.println("string are not equal");
       }
    }
}
