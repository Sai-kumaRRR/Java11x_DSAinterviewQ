package ex03_Part03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab27_ListofString {
    public static void main(String[] args) {
                List<String> list = new ArrayList<>(Arrays.asList("banana","apple","orange"));

                Collections.sort(list);
                System.out.println("sort list:"+ list);
            }
        }

