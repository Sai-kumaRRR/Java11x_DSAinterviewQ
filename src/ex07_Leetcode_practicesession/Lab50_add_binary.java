package ex07_Leetcode_practicesession;

public class Lab50_add_binary {
    public String addBinary(String a, String b) {
        int carry = 0;

        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';

            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';

            }
            result.insert(0, sum % 2);
            carry = sum / 2;
        }
        return result.toString();
    }
}
