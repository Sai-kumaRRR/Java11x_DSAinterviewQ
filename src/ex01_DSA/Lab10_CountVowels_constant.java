package ex01_DSA;

public class Lab10_CountVowels_constant {

    public int[] countVowels(String str) {
        int vCount = 0;
        int cCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;

            } else if (ch >= 'a' && ch <= 'z') {
                cCount++;
            }
            }
         return new int[]{vCount, cCount};
            }


        }




