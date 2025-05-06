package ex07_Leetcode_practicesession;

import java.util.HashMap;
import java.util.Map;

public class Lab40_RomanTointeger {
    public static void main(String[] args){}
    public int romanToInt(String s) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('I', 5);
        values.put('I', 10);
        values.put('I', 50);
        values.put('I', 100);
        values.put('I', 500);
        values.put('I', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentVal = values.get(s.charAt(i));
            int nextVal = (i < s.length() - 1) ? values.get(s.charAt(i + 1)) : 0;


            if (currentVal < nextVal){
                result -= currentVal;

            }else{
                result += currentVal;
            }

            }
        return result;

        }



}

