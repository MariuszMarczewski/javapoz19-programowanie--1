package pl.sdaacademy.javapoz19programowanie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationBook {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("W pustyni i w puszczy", 1910, 300),
                new Book("Krzyżacy", 1900, 1000),
                new Book("Dziady III", 1832, 250),
                new Book("Dziady I", 1860, 350),
                new Book("Zielona mila", 1996, 290),
                new Book("Balladyn", 1839, 400),
                new Book("Harry Potter i Czara ognia", 2005, 650),
                new Book("Harry Potter i Ksiaze Polkrwi", 2009, 650),
                new Book("Romeo i Julia", 1595, 340)

        );

        books.stream()
                .filter(book -> book.getReleaseYear() < 2000)
                .filter(book -> book.getPages() > 300)
                .map(book -> book.getTitle())
                .forEach(title -> System.out.println(title));


//        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        integers.stream()
//                .filter(n -> n % 2 == 0)
//                .filter(n -> n > 5)
//                .filter(n -> n < 10)
//                .map(n -> n * 2)
//                .map(n -> n % 3 == 0? "podzielny przez 3" : "niepodzielny przez 3")
////                .forEach(n -> System.out.println(n))
////                .forEach(System.out::println)
//                .collect(Collectors.toList());
//        System.out.println(collect);

    }
}