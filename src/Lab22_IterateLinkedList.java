import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Lab22_IterateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D"));
        // using iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

            // using enhanced for each
            for(String item:list){
                System.out.println(item);
            }
            //using for loop with index
            for(int i =0; i< list.size(); i++){
                System.out.println(list.get(i));
            }
        }

    }


}
