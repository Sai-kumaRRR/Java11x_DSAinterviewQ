package ex04_Arrays;

public class Lab34_ReverseArrays {
    public static void main(String[] args) {

        int[] numbers = {1 , 2 , 3 , 4 , 5};
        System.out.println("Reversed array:");
        for (int i = numbers.length - 1; i>= 0; i--){
            System.out.println(numbers[i] +" ");
        }
    }
}
