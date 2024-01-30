package demo.baitap.bai8;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Map {
    public static void main(String[] args) {
        String s="Bước 2: Sử dụng Stream API và phương thức anyMatch() để kiểm tra xem danh sách có chứa ít nhất một số chẵn hay không.Bài tập 6: Sử dụng phương thức map()\n";

        List<String>strings= List.of(s.split(" "));
        System.out.println(strings);
        Function<String,String>function=String::toUpperCase;
        List<String> newString= strings.stream().map(function).toList();
        System.out.println(newString);
    }
}
