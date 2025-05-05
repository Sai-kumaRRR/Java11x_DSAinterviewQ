import java.util.HashSet;
import java.util.Set;

public class Lab25_ListToSet {
    public static  void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple","banana","orange","apple"));
        Set<String> set = new HashSet<>(list);

        System.out.println("List:"+ list);
        System.out.println("Set:"+set);

    }
}
