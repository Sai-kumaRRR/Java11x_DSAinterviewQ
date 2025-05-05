package ex04_Arrays;

public class Lab41_even_odd_number_of_array {
    public static void main(String[] args) {
        int[] numbers = {1 , 5 , 7 , 9 };
        System.out.println("Even numbers:");
        for(int number: numbers){
            if(number %2 == 0){
                System.out.println(number + " ");
            }
        }
        System.out.println("\n odd numbers:");
        for(int number: numbers){
            if(number % 2 != 0){
                System.out.println(number + " ");
            }
        }
    }
}
