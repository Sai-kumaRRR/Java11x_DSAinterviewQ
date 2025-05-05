package ex02_Part02;

import java.util.Scanner;

public class Lab11_Prime_number_check {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return true;

        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        if(isPrime(num)) {
            System.out.println(num + "is a prime numbers");
        } else{
            System.out.println(num +"is not a prime number.Lab12_");


        }


    }
}








