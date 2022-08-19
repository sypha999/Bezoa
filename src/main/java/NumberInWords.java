import java.util.*;

public class NumberInWords {
    public static void main(String[] args) {

    }

    public static String toWord(String word){
        String ans = "";
        Map <Integer,String> myMap = new HashMap<>();
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



        return ans;
    }
}
