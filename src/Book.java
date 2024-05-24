import java.util.Arrays;

public class Book {
    private String title;
    private int pages;
    private long releaseYear;
    public Book(){

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
        return this.getTitle();
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPages() {
        return this.getPages();
    }
    public void setReleaseYear(long releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getReleaseYear() {
        return this.getReleaseYear();
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title of th book: " + title + '\'' +
                ", number of pages: '" + pages + '\'' +
                ", release data: " + releaseYear +
                '}';
    }
}

//        sukurti 3 objektus su reikšmėmis naudojantis tuščiu konstruktoriu, ir tris naudojantis pilnu konstuktoriu.
//sudėti juos į knygų masyvą.
//prasukti ciklą per masyvą ir atspausdinti knygas (naudojam getterius)
