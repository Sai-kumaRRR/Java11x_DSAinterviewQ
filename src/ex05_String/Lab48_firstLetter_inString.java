package ex05_String;

public class Lab48_firstLetter_inString {
    public static void main(String[] args) {
        String str = "Hello world form java";
        StringBuilder firstLetters = new StringBuilder();

   // first letter of each word in a string.
        for (String word : str.split("\\s+")) {
            firstLetters.append(word.charAt(0));
            System.out.println("first letters:" + firstLetters);

        }


    }
}