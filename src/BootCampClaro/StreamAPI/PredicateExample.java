package BootCampClaro.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "C", "Go", "Ruby", "Javascript");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;



        palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);
    }
}
