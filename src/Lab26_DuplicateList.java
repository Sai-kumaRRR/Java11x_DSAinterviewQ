import java.util.*;

public class Lab26_DuplicateList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("apple","banana","orange","apple"));
        Set<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println("list without duplicates:" + list);
    }


}

