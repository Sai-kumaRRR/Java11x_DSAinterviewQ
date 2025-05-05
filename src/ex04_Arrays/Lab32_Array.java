package ex04_Arrays;

import java.util.Map;
import java.util.HashMap;

public class Lab32_Array {
    public static void main(String[] args) {
        int[] numbers = {2,2,3 , 4 , 5 , 5 , 5 ,3 ,4};
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for(int number : numbers){
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0)+1);

            for(Map.Entry<Integer,Integer>entry : frequencyMap.entrySet()){
                System.out.println("Element:"+entry.getKey());
            }
        }

    }
}
