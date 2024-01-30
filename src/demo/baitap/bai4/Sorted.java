package demo.baitap.bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorted {
    public static void main(String[] args) {
        Random random=new Random();
        List<String> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf((char) ('a' + random.nextInt(26))));
        }
        System.out.println(list);
        List<String> list1 = list.stream().sorted(String::compareTo).toList();
        System.out.println("mảnh đã sắp xếp"+list1);
    }
}
