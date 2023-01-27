package StringConcatenation;

public class Concatenation {
    public static void main(String[] args){
        int num=50;
        String str1= "Nidhi" +" Agarwal";
        String str2= str1 + " Shalu";
        System.out.println("String 1 " + str1);
        System.out.println("String 2 " + str2);
        String str3 = num  +  10 + str1 + num + 10;
        System.out.println("String 3 " + str3);
        String str4= str3.concat(" BCA");
        System.out.println(" String 4 " + str4);
        String str5 = " MY ".concat(str3);
        System.out.println("String 6" + str5);

    }
}
