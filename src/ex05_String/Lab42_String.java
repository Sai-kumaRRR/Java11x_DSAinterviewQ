package ex05_String;

public class Lab42_String {
    public static void main(String[] args) {
 String str = "Geeks for geeks";
  str = str.replaceAll("\\s","");
        System.out.println("String without spaces:"+ str+" ");
    }
}
