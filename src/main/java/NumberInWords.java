import java.util.*;

public class NumberInWords {

    public static Map <Integer,String> myMap = new HashMap<>();
    public static Map <Integer,String> myWordMap = new HashMap<>();
    public static void main(String[] args) {
    /* USAGE
                toWord(word, Digit) --> converts from word to digit
                toWord(String value of digit, Word) --> converts from digit to word

     */

        System.out.println(toWord("1","word"));

    }

    public static String toWord(String word, String method){
        String ans = "";
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


            for (int i = 0; i < word.length(); i++) {

                if()
            }

        if(myMap.containsKey(( word2))){return myMap.get(word2);}




        }

        if(method.equalsIgnoreCase("digit")){

        }


        return ans;
    }

    public static String fun (int a){
        String res="";

        return res;
    }


}
