package Array1d;
import java.util.*;
public class Ques1 {
    //Input : "hello world"
    //Output: "h1e1l3o2w1r1d1
    public static void main(String[] args) {
        String str= "hello world";
        characterCount(str);

    }
    static void characterCount(String inputString){
        HashMap <Character, Integer> counterMap= new HashMap<Character, Integer>();
        //converting string to char Array
        char[] strArray = inputString.toCharArray();
        //checking each character of strArray
        for(char c: strArray){
            if(counterMap.containsKey(c)){
                //if char is present in counterMap,increment +1
                counterMap.put(c,counterMap.get(c) +1);
            }
//            else if(c == " "){
                counterMap.put(c ,1);
            }
        }
        for(Map.Entry e1 : counterMap.entrySet()){
            System.out.println(e1.getKey() + " " + e1.getValue());
        }

    }
}

