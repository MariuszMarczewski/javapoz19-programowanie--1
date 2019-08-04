package pl.sdaacademy.javapoz19programowanie.Books;

import java.util.List;

public interface AuthorsRepository {
    List<Author> findAll();
}
