import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Book book = new Book();
        book.setTitle("The Prisoner's Throne");
        book.setPages(368);
        book.setReleaseYear(2024/04/05);
        Book book1 = new Book();
        book1.setTitle("People of the Storm");
        book1.setPages(284);
        book1.setReleaseYear(2022/04/28);
        Book book2 = new Book();
        book2.setTitle("Landis");
        book2.setPages(332);
        book2.setReleaseYear(2023/11/7);
        Book book3 = new Book("The Enchanted Castle", 255, 2019/06/13);
        Book book4 = new Book("The Legend of Black Jack", 456, 2022/05/15);
        Book book5 = new Book("Grey Lore", 388, 2019/07/06);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        for (Book bookList: books ){
            System.out.println(bookList);
        }

    }

}

//prasukti ciklą per masyvą ir atspausdinti knygas (naudojam getterius)
