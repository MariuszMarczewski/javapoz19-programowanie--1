package pl.sdaacademy.javapoz19programowanie;

public class Book {
    private String title;
    private int releaseYear;
    private int pages;

    public Book() {

    }

    public Book(String title, int releaseYear, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
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
}
