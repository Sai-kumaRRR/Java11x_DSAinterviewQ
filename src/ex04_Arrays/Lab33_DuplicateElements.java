package ex04_Arrays;

import java.util.HashSet;

public class Lab33_DuplicateElements {
    public static void main(String[] args) {
        int[] numbers = {1 , 2 , 3  ,4 , 5 , 1 ,2 , 3};
        HashSet<Integer>seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int number : numbers){
            if (seen.add(number)) {

                duplicates.add(number);
            }
        }
        System.out.println("Duplicate elements:" + duplicates);
    }
}
