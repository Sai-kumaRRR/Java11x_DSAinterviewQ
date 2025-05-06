package ex07_Leetcode_practicesession;

public class Lab46_count_say {
    public static void main(String[] args) {

    }
        public String countSay ( int n){
            if (n <= 0) return "";
            String result = "1";
            for (int i = 1; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                char preChar = result.charAt(0);
                int count = 1;
                for (int j = 1; j < result.length(); j++) {
                    char currentChar = result.charAt(j);
                    if (currentChar == preChar) {
                        count++;
                    } else {
                        sb.append(count).append(preChar);
                        preChar = currentChar;
                        count = 1;
                    }
                }
                sb.append(count).append(preChar);
                result = sb.toString();

            }
            return result;
        }
    }
       // count and say