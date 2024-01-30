package demo.baitap.bai1;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Max {
    public static void main(String[] args) {
        Random random=new Random();
        Supplier<Integer> supplier=()-> random.nextInt(100);
        List<Integer> list=Stream.generate(supplier).distinct().limit(20).toList();
        Optional<Integer> max=list.stream().max((a, b)->a-b).stream().findFirst();

        System.out.println("số lơn nhất"+max);


    }
}
