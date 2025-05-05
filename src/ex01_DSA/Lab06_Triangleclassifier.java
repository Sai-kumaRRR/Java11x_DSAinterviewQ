package ex01_DSA;

public class Lab06_Triangleclassifier {
    public static void main(String[] args) {
        int side1 = 5;
        // replace with the length of your triangle's

        int side2 = 4;
        int side3 = 6;
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral triangle");
        } else if(side1 == side2  || side3 == side1 || side2 == side3) {
            System.out.println("Isosceles triangle");
        }else {
            System.out.println("Scalene triangle");
        }


    }
}
