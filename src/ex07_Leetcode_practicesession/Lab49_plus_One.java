package ex07_Leetcode_practicesession;

public class Lab49_plus_One {
    public int[] plusone(int[] digits){
        int n = digits.length;
        for(int i = n -1; i>= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[n+1];
        newNumber[0] = 1;
        return newNumber;
    }
}
