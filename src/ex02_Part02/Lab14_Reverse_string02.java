package ex02_Part02;

import java.util.Scanner;

public class Lab14_Reverse_string02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = scanner.nextLine();


        String reversed = new StringBuilder(input).reverse().toString();

        if(input.equals(reversed)){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
