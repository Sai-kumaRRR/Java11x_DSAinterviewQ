package ex04_Arrays;

import java.util.Arrays;

public class Lab39_secondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {12 , 34 , 78 , 98};
        Arrays.sort(numbers);

        System.out.println("Second largest numbers: + numbers[numbers.length-2]");

    }
}
