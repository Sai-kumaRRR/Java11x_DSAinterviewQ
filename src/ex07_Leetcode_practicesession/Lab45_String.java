package ex07_Leetcode_practicesession;

public class Lab45_String {
    public int strStr(String haystack , String needle) {
        if(needle.isEmpty()) return 0;
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            if(haystack.substring(1, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;

    }
}
     // implement str