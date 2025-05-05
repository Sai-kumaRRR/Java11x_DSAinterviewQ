package ex05_String;

public class Lab45_Palindrome_string {
    public static void main(String[] args) {
        String str = "madam";

        String reversedStr = new StringBuilder(str).reverse().toString();

        if(str.equals(reversedStr)){
            System.out.println(str +"is a palindrome.");

        }else{
            System.out.println(str + "is not a palindrome.");
        }

    }
}
