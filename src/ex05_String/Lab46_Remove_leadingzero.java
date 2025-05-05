package ex05_String;

public class Lab46_Remove_leadingzero {
    public static void main(String[] args) {
        String str = "00012345";

        str = str.replaceFirst("^0+(?!$)"," ");
        System.out.println("String without leading zeros:"+ str +" ");
    }
}
