package Array2D;

public class ConvertStringToArray {
    //str="i like java"
    //strArr=["i", "like", "java"]
    public static void main(String[] args) {
        String str= "i like java";


         String[] strArr= null;

         //converting using string.split() method
        strArr= str.split(",");

        //print
        for(int i=0; i<strArr.length; i++){
            System.out.print(strArr[i]);
        }
    }
}
