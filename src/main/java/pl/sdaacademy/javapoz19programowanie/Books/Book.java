package pl.sdaacademy.javapoz19programowanie.Books;

public class Book {
    private String title;
    private int releaseYear;
    private int pages;
    private Author author;

    public Book() {

    }

    public Book(String title, int releaseYear, int pages, Author author) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", pages=" + pages +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getPages() {
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}