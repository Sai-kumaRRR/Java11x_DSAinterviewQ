package ex03_Part03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab19_ArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1 , 2 , 3 , 4 ,5));

        Collections.reverse(list);
        System.out.println("Reversed ArrayList:"+list);
    }
}
