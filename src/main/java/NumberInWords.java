import java.util.*;

public class NumberInWords {

    public static Map <Integer,String> myMap = new HashMap<>();
    public static Map <String,String> myWordMap = new HashMap<>();
    public static void main(String[] args) {
    /* USAGE
                toWord(word, Digit) --> converts from word to digit
                toWord(String value of digit, Word) --> converts from digit to word

     */

        System.out.println(convert("2724223","word"));
       // System.out.println(convert("two hundred", "digit"));


    }

    public static String convert(String word, String method){
        String ans = "";
        String word3=word;
        myMap.put(1,"one"); myWordMap.put("one","1");
        myMap.put(2,"two"); myWordMap.put("two","2");
        myMap.put(3,"three"); myWordMap.put("three","3");
        myMap.put(4,"four"); myWordMap.put("four","4");
        myMap.put(5,"five"); myWordMap.put("five","5");
        myMap.put(6,"six"); myWordMap.put("six","6");
        myMap.put(7,"seven"); myWordMap.put("seven","7");
        myMap.put(8,"eight"); myWordMap.put("eight","8");
        myMap.put(9,"nine"); myWordMap.put("nine","9");
        myMap.put(10,"ten"); myWordMap.put("ten","10");
        myMap.put(11,"eleven"); myWordMap.put("eleven","11");
        myMap.put(12,"twelve"); myWordMap.put("twelve","12");
        myMap.put(13,"thirteen"); myWordMap.put("thirteen","13");
        myMap.put(14,"fourteen"); myWordMap.put("fourteen","14");
        myMap.put(15,"fifteen"); myWordMap.put("fifteen","15");
        myMap.put(16,"sixteen"); myWordMap.put("sixteen","16");
        myMap.put(17,"seventeen"); myWordMap.put("seventeen","17");
        myMap.put(18,"eighteen"); myWordMap.put("eighteen","18");
        myMap.put(19,"nineteen"); myWordMap.put("nineteen","19");
        myMap.put(20,"twenty"); myWordMap.put("twenty","20");
        myMap.put(30,"thirty"); myWordMap.put("thirty","30");
        myMap.put(40,"forty"); myWordMap.put("forty","40");
        myMap.put(50,"fifty"); myWordMap.put("fifty","50");
        myMap.put(60,"sixty"); myWordMap.put("sixty","60");
        myMap.put(70,"seventy"); myWordMap.put("seventy","70");
        myMap.put(80,"eighty"); myWordMap.put("eighty","80");
        myMap.put(90,"ninety"); myWordMap.put("ninety","90");

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
            }}}

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
        if(length==18){ return "quintillion";}

        return res;
    }


}
