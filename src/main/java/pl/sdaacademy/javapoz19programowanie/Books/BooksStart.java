package pl.sdaacademy.javapoz19programowanie.Books;

import java.util.List;
import java.util.Scanner;

public class BooksStart {

    private BooksViews views;
    private AuthorsRepository authorsRepository;

    public BooksStart() {
        this.views = new BooksViews((new Scanner(System.in)));
        this.authorsRepository = new InMemoryAuthorsRepository();
    }

    public void start() {

        boolean flag = true;
        do {
            int decision = views.startMenu();

            switch (decision) {
                case 1:
                    authorsView();
                    break;
                case 2:
                    booksView();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

    private void booksView() {
        System.out.println("Tutaj będą autorzy");
        int decision = views.authorsMenu(authorsRepository.findAll());
    }

    private void authorsView() {
        System.out.println("Tutaj będą książki");

        boolean flag = true;

        List<Author> authors = authorsRepository.findAll();

        do {
            int decision = views.authorsMenu(authors);

            switch (decision) {
                case 1: // findByNation
                    Nation nation = views.getNation();
                    authors = authorsRepository.findByNation(nation);
                    break;
                default:
                    flag = false;

            }

        } while (flag);
    }
}
