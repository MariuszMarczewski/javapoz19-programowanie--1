package pl.sdacademy.javapoz19programowanie1.Books;


import java.util.List;

public interface BooksRepository {


    List<Book> findAll();

    List<Book> findByAfterReleaseYear(int releaseYear);

    List<Book> searchByPhrase(String phrase);


    List<Book> searchByAuthor(String authorPhrase);

}
