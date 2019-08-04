package pl.sdaacademy.javapoz19programowanie.Books;

import java.util.ArrayList;
import java.util.List;

public class InMemoryAuthorsRepository implements AuthorsRepository {

    private List<Author> authors;

    public InMemoryAuthorsRepository() {
        this.authors = new ArrayList<>();
        init();
    }

    @Override
    public List<Author> findByNation(Nation nation) {
        return null;
    }

    @Override
    public List<Author> findAll() {
        return new ArrayList<>(authors);
    }

    private void init(){

                authors.add(new Author("Stephen", "King", 1947, Nation.ENGLISH));
                authors.add(new Author("Henryk", "Sienkiewicz", 1846, Nation.POLISH));
                authors.add(new Author("Adam", "Mickiewicz", 1798, Nation.POLISH));
                authors.add(new Author("Juliusz", "Słowacki", 1849, Nation.POLISH));
                authors.add(new Author("Joanne Murray", "Rowling", 1965, Nation.POLISH));
                authors.add(new Author("William", "Shakespeare", 1564, Nation.POLISH));

    }
}
