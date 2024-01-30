package demo.baitap.bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Filter {

    public static void main(String[] args) {
        Random random=new Random();
        Supplier<Integer>supplier=()-> random.nextInt(100);
        List<Integer> list=Stream.generate(supplier).distinct().limit(20).toList();
        list.stream().filter(a -> a % 2 == 0).forEach(System.out::println);
    }
}
