package ex01_DSA;

public class Lab09_Pyramid_pattern {
    public static void main(String[] args) {
        int row = 5; // number of row in the pyramid

        for(int i = 1; i <= 5 * i -1 ; i++){
            System.out.println("*");
            for(int j =1; j <=8 * j -5; j++){
                System.out.println("*");
            }
            for(int k =1; k <= 2 * k -1; k++){
                System.out.println("*");

            }
            System.out.println();
        }
    }
}
