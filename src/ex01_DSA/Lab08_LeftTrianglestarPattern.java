package ex01_DSA;

public class Lab08_LeftTrianglestarPattern {

    public static void main(String[] args) {
        int n = 5;
        for(int i = n; i >= 1; i--){
            for(int j= 1; j<= i; j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
