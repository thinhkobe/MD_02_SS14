package demo.baitap.bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {

        Random random=new Random();
        Supplier<Integer>supplier=()-> random.nextInt(100);
        List<Integer>list= Stream.generate(supplier).distinct().limit(20).toList();
        int total=list.stream().reduce(0, Integer::sum);
        System.out.println(total);
    }
}

