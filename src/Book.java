import java.util.Arrays;

public class Book {
    private String title;
    private int pages;
    private long releaseYear;

    public Book() {

    }

    public Book(String title, int pages, long releaseYear) {
        this.title = title;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return this.pages;
    }

    public void setReleaseYear(long releaseYear) {
        this.releaseYear = releaseYear;
    }

    public long getReleaseYear() {
        return this.releaseYear;
    }

//    @Override
//    public String toString() {
//        return "Book " +
//                "Title of th book: " + title +
//                ", number of pages: " + pages +
//                ", release data: " + releaseYear +
//                ' ';
//    }
}

