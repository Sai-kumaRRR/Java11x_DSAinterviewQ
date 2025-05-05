package ex04_Arrays;

public class Lab36_SmallestElement {
    public static void main(String[] args) {
        int[] numbers = {12 , 34 , 56};
        int min = numbers[0];

        for (int number: numbers){
            if(number < min){
                min  = number;
            }
        }
        System.out.println("smallest element:" + min);
    }
}
