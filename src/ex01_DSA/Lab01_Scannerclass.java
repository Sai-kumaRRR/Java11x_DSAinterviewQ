package ex01_DSA;

import java.util.Scanner;

public class Lab01_Scannerclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // integer value for data type - int
        System.out.println("Enter your name");
        // String for
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age =  scanner.nextInt();
        System.out.println("Hello"+ name +"you are"+age +"years old");

        scanner.close();

    }
}
