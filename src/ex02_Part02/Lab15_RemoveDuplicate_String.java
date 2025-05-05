

public class Lab15_Duplicate_String {
    public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }


        return result;

    }


}
    public static void main(String[] args){
    String input = "Hello World";
    String output = Lab15_Duplicate_String.removeDuplicates(input);
    System.out.println(output);


}