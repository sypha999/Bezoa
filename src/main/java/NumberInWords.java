import java.util.*;

public class NumberInWords {

    public static Map <Integer,String> myMap = new HashMap<>();
    public static Map <Integer,String> myWordMap = new HashMap<>();
    public static void main(String[] args) {
    /* USAGE
                toWord(word, Digit) --> converts from word to digit
                toWord(String value of digit, Word) --> converts from digit to word

     */

        System.out.println(toWord("01009009","word"));


    }

    public static String toWord(String word, String method){
        String ans = "";
        String word3=word;
        myMap.put(1,"one");
        myMap.put(2,"two");
        myMap.put(3,"three");
        myMap.put(4,"four");
        myMap.put(5,"five");
        myMap.put(6,"six");
        myMap.put(7,"seven");
        myMap.put(8,"eight");
        myMap.put(9,"nine");
        myMap.put(10,"ten");
        myMap.put(11,"eleven");
        myMap.put(12,"twelve");
        myMap.put(13,"thirteen");
        myMap.put(14,"fourteen");
        myMap.put(15,"fifteen");
        myMap.put(16,"sixteen");
        myMap.put(17,"seventeen");
        myMap.put(18,"eighteen");
        myMap.put(19,"nineteen");
        myMap.put(20,"twenty");
        myMap.put(30,"thirty");
        myMap.put(40,"forty");
        myMap.put(50,"fifty");
        myMap.put(60,"sixty");
        myMap.put(70,"seventy");
        myMap.put(80,"eighty");
        myMap.put(90,"ninety");

        if(method.equalsIgnoreCase("word")){
        int word2 = 0;
        try{
            word2 = Integer.parseInt(word);
        }
        catch (Exception e){
            System.out.println("please enter just digits");
        }

        if(myMap.containsKey(( word2))){return myMap.get(word2);}

        else{
            int count=word3.length()%3;
            if(count!=0){ans = fun(Integer.parseInt(word3.substring(0,count))) + " " +fun2(word3.length()-count);
            word3=word3.substring(count);}
          while ( word3.length()!=0) {
              ans = ans + " "+fun(Integer.parseInt(word3.substring(0,3)))+ " " + fun2(word3.length()-3);
              if(word3.length()<4){word3="";}
              else word3 = word3.substring(3);
            }

        }


        }

        if(method.equalsIgnoreCase("digit")){

        }


        return ans;
    }

    public static String fun (int a){
        String res="";
        String wrk=String.valueOf(a);
        if(myMap.containsKey(a)) return myMap.get(a);
        // integer a should always have a length of 2 or 3
        if(String.valueOf(a).length()==2){
        for (int i = 0; i < String.valueOf(a).length() ; i++) {
            if(i==0){res = res + myMap.get(Integer.parseInt(wrk.substring(i,i+1)+"0"))+" ";}
            res = res + myMap.get(a%10);
            break;
        }}

        if(String.valueOf(a).length()==3){
            for (int i = 0; i < String.valueOf(a).length() ; i++) {
                if(i==0){res = res + myMap.get(Integer.parseInt(wrk.substring(i,i+1))) +" hundred and";
                    wrk=wrk.substring(1);}

                if(wrk.length()==2){
                    res = res +" "+ myMap.get(Integer.parseInt(wrk.substring(0,1)+"0"));
                    wrk=wrk.substring(1);
                }
                if(wrk.length()==1){
                    res = res +" "+ myMap.get(Integer.parseInt(wrk));
                    break;
                }

            }}

        return res;
    }

    public static String fun2(int length){
        String res="";
        if(length==3){ return "thousand" ;}
        if(length==6){ return "million" ;}
        if(length==9){ return "billion";}
        if(length==12){ return "trillion";}
        if(length==15){ return "quadrillion";}
        if(length==15){ return "quintillion";}

        return res;
    }


}
