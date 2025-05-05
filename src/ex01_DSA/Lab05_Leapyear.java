package ex01_DSA;

public class Lab05_Leapyear {
    public static void main(String[] args) {
        int year = 2025;
        boolean isLeapYear = false;
        if((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)){
            isLeapYear = true;

        }
        if (isLeapYear) {
            System.out.println(year + "is a leap year.");
        } else {
            System.out.println(year +"is not a leap year.");
        }
    }
}
