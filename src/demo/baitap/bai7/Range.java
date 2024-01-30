package demo.baitap.bai7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap X");
        int x= Integer.parseInt(sc.nextLine());
        System.out.println("nhap Y");
        int y= Integer.parseInt(sc.nextLine());
        IntStream intStream=IntStream.range(x,y);
        intStream.forEach(System.out::println);
    }
}
