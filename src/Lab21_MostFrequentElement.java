import java.util.*;

public class Lab21_MostFrequentElement {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1 , 2 , 3 , 3 , 4 , 5 , 5 , 5));
        int mostFrequent = findMostFrequentElement(list);
        System.out.println("Most Frequent Element:" + mostFrequent);
    }

    public static int findMostFrequentElement(List<Integer> list) {
        Map<Integer, Integer> frequencyMap = new HashMap();
        for(int num : list){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) +1);

        }
        return Collections.max(frequencyMap.entrySet(),Map.Entry.comparingByValue()).getKey();



    }
}
