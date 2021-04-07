package Map;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> language = new HashMap<>();
        language.put("Tr", "Turkish language");
        language.put("En", "English language");
        for(Object i : language.keySet()){
            System.out.println(i);
            System.out.println(language.get(i));
        }
        for(Object i : language.values()){
            System.out.println(i);
        }
        if(language.containsKey("Tr")){
            System.out.println("It contains the value of Tr");
        }else{
            language.put("Tr","Turkish language");
        }
        language.remove("Tr");
    }
}
