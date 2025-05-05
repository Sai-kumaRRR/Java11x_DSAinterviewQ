
public class Lab17Java_Anagrams {
    public static void main(String[] args) {

        String s1 = "silent";
        String s2 = "listen";

        if(areAnagrams(s1,s2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}
public  static boolean areAnagrams(String s1, String s2) {

    s1 = s1.replaceAll("[A-zA-z]", "").toLowerCase();
    s2 = s2.replaceAll("[A-zA-z]", "").toLowerCase();

    if (s1.length() != s2.length()) {


        return false;

    }
    char[] arr1 = s1.toCharArray();
    Arrays.sort(arr1);
    char[] arr2 = s2.toCharArray();
    Arrays.sort(arr2);

    for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] != arr2[i]) {
            return false;

        }
    }
    return true;

}

public void main() {
}
