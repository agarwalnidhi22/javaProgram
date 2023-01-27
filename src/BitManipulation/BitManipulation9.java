package BitManipulation;

import java.util.ArrayList;

public class BitManipulation9 {
    //question--> grey code
    // input --> 3
    // output--> [000,001,011,010,110,111,101,100]

    public static void main(String[] args) {
        int  num=3;
        ArrayList<String> ans= greyCode(num);
        System.out.println(ans);


    }

    public static ArrayList<String> greyCode(int n){
        // base case
        if(n==1){
            ArrayList<String> al= new ArrayList<>();
            al.add("0");
            al.add("1");
             return al;

        }
        //faith and work
        ArrayList<String> recursiveAns = greyCode(n-1);
        ArrayList<String> result = new ArrayList<>();

        //I want to add 0
        for(int i=0; i<recursiveAns.size(); i++){
            String item= recursiveAns.get(i);
            result.add("0" + item);
        }
        //I want to add 1
        for(int i=recursiveAns.size()-1; i>0; i--){
            String item = recursiveAns.get(i);
            result.add("1"+ item);
        }
        return  result;


    }
}
