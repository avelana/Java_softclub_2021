package task01;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
//        List<String> items = new ArrayList<>();
//        items.add("Pen");
//        items.add("Pencil");
//        items.add("Box");
//        for (String i : items) {
//            if (i.indexOf("P") == 0) {
//                continue;
//            } else {
//                System.out.print(i + " ");
//            }
//        }

        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);
        s1.substring(4);
        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt);
    }
}

