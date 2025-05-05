package ex04_Arrays;

import java.util.Arrays;

public class Lab38_sort_of_element {
    public static void main(String[] args) {
        int[] numbers = {5 , 3 , 6 , 8 , 2};

        Arrays.sort(numbers);
        System.out.println("Sorted Array:");
        for(int number : numbers){
            System.out.println(number + " ");
        }

    }
}
