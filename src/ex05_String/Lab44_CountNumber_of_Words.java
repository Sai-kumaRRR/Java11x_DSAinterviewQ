package ex05_String;

public class Lab44_CountNumber_of_Words {
    public static void main(String[] args) {
        String str = "Hello world! welcome to java.";

        String[] words = str.split("\\s+");

        System.out.println("number of words:" + words.length);
    }
}
