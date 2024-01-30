package demo.baitap.bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Map {
    public static void main(String[] args) {
        Random random=new Random();
        List<Integer> list=new ArrayList<>() ;
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        list.stream().filter(a -> a % 2 == 0).forEach(System.out::println);
        boolean check= list.stream().anyMatch(a->a%2==0);
        System.out.println(check);

    }
}
