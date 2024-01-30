package demo.baitap.bai5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ForEach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        Supplier<Integer> supplier=()->random.nextInt(100);
        List<Integer>list= Stream.generate(supplier).distinct().limit(20).toList();
        System.out.println(list);
        System.out.println("nhập số N");
        int n= Integer.parseInt(sc.nextLine());
        Predicate<Integer> predicate=a->a>n;
        list.stream().filter(predicate).forEach(System.out::println);
    }
}
