package homework10;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Fruit {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "apricot", "pear", "grapes");
        int sum = fruits.subList(0,3).stream()
                .map(word -> word.length())
                .reduce((f, f2) -> f + f2).get();

        long withA = fruits.stream().filter(str -> str.startsWith("a")).count();
        long length = fruits.stream().filter(str -> (str.length()>4)).count();


        System.out.println("Kількість фруктів, ім'я яких починається на A = " + withA);
        System.out.println("Фрукти, довжина ім'я яких >4 = " +length);
        System.out.println("Сума літер перших 3 фруктів = "  +sum);
    }
}
