package ex02_Part02;

public class Lab12_Palindrome_String {
    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();

        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String input = "madam";
        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        }


    }

}