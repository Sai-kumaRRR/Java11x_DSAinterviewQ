import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab20_MergeSortedLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 7));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 6, 8));
        List<Integer> mergedList = mergeSortedLists(list1, list2);
        System.out.println("Merged sorted List:" + mergedList);
    }

    public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size()  && j < list2.size()) {
        }
            if (list1.get(i) < list2.get(j)) {
                result.add(list1.get(i++));

            } else {
                result.add(list2.get(j++));
            }
            while (i < list2.size()) {
                result.add(list2.get(j++));


            }
            return result;
        }


    }





