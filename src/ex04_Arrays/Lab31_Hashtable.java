package ex04_Arrays;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class Lab31_Hashtable {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "one");
        hashtable.put(2, "two");

        Enumeration<Integer> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer key = keys.nextElement();
            System.out.println("Key:" + key + " value:" + hashtable.get(key));


        }
        //Alternatively , using entrySet()
        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println("key:" + entry.getKey() + "value:" + entry.getValue());
        }
    }
}