package ex03_Part03;

import java.util.HashMap;
import java.util.Map;

public class Lab28_HasMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple",1);
        map.put("orange",2);
        map.put("graphics",3);

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +":"+entry.getValue());
        }

    }
}
