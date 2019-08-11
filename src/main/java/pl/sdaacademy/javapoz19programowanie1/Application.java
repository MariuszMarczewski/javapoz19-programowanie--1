package pl.sdaacademy.javapoz19programowanie1;

import pl.sdaacademy.javapoz19programowanie1.Books.Author;
import pl.sdaacademy.javapoz19programowanie1.Books.Nation;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        System.out.println("hello world");


        Author author1 = new Author("Henryk", "Sienkiewicz", 1846, Nation.PL);
        Author author2 = new Author();
        author2.setFirstName("Stephen");
        author2.setLastName("King");
        author2.setBirthYear(1947);
        author2.setNation(Nation.ENG);
        Author author3 = new Author("Adam", "Mickiewicz", 1800, Nation.PL);

        List<Author> authors = Arrays.asList(author1, author2, author3);
                new Author("Juliusz", "Słowacki", 1849, Nation.PL);
                new Author("Joanne Murray", "Rowling", 1965, Nation.ENG);
                new Author("William", "Shakespeare", 1564, Nation.ENG);

//        List<Author> authors = Arrays.asList(author1, author2, author3);


        showByNation(authors, Nation.PL);

        System.out.println(" ");
        showByNationAndYear(authors, Nation.PL, 1700);

        System.out.println(" ");
        showModernAuthors(authors);

        System.out.println(" ");
        System.out.println(groupByNation(authors));

        ApplicationBook book = new ApplicationBook();


    }

    private static void showByNation(List<Author> authors, Nation nation) {

        for (Author author : authors) {
            if (author.getNation().equals(nation)) {
                System.out.println(author);
            }
        }

    }

    private static void showModernAuthors(List<Author> authors){

        for (Author author : authors){
            if(author.getBirthYear() > 1900){
                System.out.println(author);
            }
        }
    }

    private static void showByNationAndYear(List<Author> authors, Nation nation, int birthYear) {
        for (Author author : authors) {
            if (author.getNation().equals(nation) && author.getBirthYear() > birthYear) {

                    System.out.println(author);
                }
            }
        }


    private static Map<Nation, List<Author>> groupByNation (List<Author> authors){

        Map<Nation, List<Author>> map = new HashMap<>();

        for( Author author : authors){
            map.putIfAbsent(author.getNation(), new ArrayList<>());
            map.get(author.getNation()).add(author);
        }
        return map;
    }
}



