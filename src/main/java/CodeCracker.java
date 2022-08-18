import java.util.*;
import java.util.Map.Entry;

public class CodeCracker {
    public static void main(String[] args) {

        System.out.println(encoder("i)\"h %d&> h)dja& *> >c%d&>&"));
    }

    public static String encoder(String s) {
        String code = "";
        String[] str = s.toLowerCase().split("");
        Map<String, String> encoderMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        encoderMap.put("a", "£");
        encoderMap.put("b", "*");
        encoderMap.put("c", "%");
        encoderMap.put("d", "&");
        encoderMap.put("e", ">");
        encoderMap.put("f", "<");
        encoderMap.put("g", "!");
        encoderMap.put("h", ")");
        encoderMap.put("i", "\"");
        encoderMap.put("j", "(");
        encoderMap.put("k", "@");
        encoderMap.put("l", "a");
        encoderMap.put("m", "b");
        encoderMap.put("n", "c");
        encoderMap.put("o", "d");
        encoderMap.put("p", "e");
        encoderMap.put("q", "f");
        encoderMap.put("r", "g");
        encoderMap.put("s", "h");
        encoderMap.put("t", "i");
        encoderMap.put("u", "j");
        encoderMap.put("v", "k");
        encoderMap.put("w", "l");
        encoderMap.put("x", "m");
        encoderMap.put("y", "n");
        encoderMap.put("z", "o");

        boolean validEntry = false;
        int entry = 0;

        while (!validEntry) {
            System.out.println("Enter 1 for Encryption\nEnter 2 for Decryption \n");
            String input = scanner.nextLine();
            try {
                entry = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("invalid entry " + e.getMessage());
            }

            if (entry == 1 || entry == 2) {
                validEntry = true;
            }
        }
        if (entry == 1) {
            //starting encryption process
            for (int i = 0; i < str.length; i++) {
                if (encoderMap.containsKey(str[i])) {
                    code = code + encoderMap.get(str[i]);
                } else {
                    code = code + str[i];
                }
            }
        }

        if (entry == 2) {

            //starting decryption process
            for (int i = 0; i < str.length; i++) {
                if (encoderMap.containsValue(str[i])) {
                    for (Entry<String, String> val : encoderMap.entrySet()) {
                        if (val.getValue().equals(str[i])) {
                            code = code + val.getKey();

                        }
                    }
                } else {
                    code = code + str[i];
                }
            }
        }

        return code;
    }

}
