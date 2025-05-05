package ex04_Arrays;

import java.util.Arrays;

public class Lab40_second_smallest_number {
    public static void main(String[] args) {
        int[] numbers = {12 , 34 , 56 , 78 , 98};
        Arrays.sort(numbers);

        System.out.println("second smallest number:"+ numbers[1]);

    }
}
