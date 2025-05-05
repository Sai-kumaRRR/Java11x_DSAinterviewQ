import java.util.*;

public class Lab23_ListIntersection {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 6, 8));

        List<Integer> intersection = findIntersection(list1, list2);
        System.out.println("Intersection:" + intersection);


    }

    public static List<Integer> findIntersection(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        set1.retainAll(set2);
        return new ArrayList<>(set1);


    }

}