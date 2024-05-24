import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Books");
        System.out.println();

        Book book = new Book();
        book.setTitle("The Prisoner's Throne");
        book.setPages(368);
        book.setReleaseYear(2024);

        Book book1 = new Book();
        book1.setTitle("People of the Storm");
        book1.setPages(284);
        book1.setReleaseYear(2022);

        Book book2 = new Book();
        book2.setTitle("Landis");
        book2.setPages(332);
        book2.setReleaseYear(2023);

        Book book3 = new Book("The Enchanted Castle", 255, 2019);
        Book book4 = new Book("The Legend of Black Jack", 456, 2022);
        Book book5 = new Book("Grey Lore", 388, 2019);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        System.out.println(books.get(0));
        System.out.println(books.get(1));
        System.out.println(books.get(2));
        System.out.println(books.get(3));
        System.out.println(books.get(4));
        System.out.println(books.get(5));
//        for (Book bookList: books ){
//            System.out.println(bookList);
//        }
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("Plants");
        System.out.println();

        Plant plant = new Plant();
        plant.setName("Sweetgum");
        plant.setLatinNamea("Liquidambar styraciflua");
        plant.setPlantLife(false);
        plant.setLocation("America");
        plant.setHeight(20);
        plant.setEdible("No");

        Plant plant1 = new Plant();
        plant1.setName("Mango tree");
        plant1.setLatinNamea("Mangifera indica");
        plant1.setPlantLife(false);
        plant1.setLocation("India");
        plant1.setHeight(30);
        plant1.setEdible("Yes");

        Plant plant2 = new Plant();
        plant2.setName("Raspberry");
        plant2.setLatinNamea("Rubus idaeus");
        plant2.setPlantLife(false);
        plant2.setLocation("Northern Europe and North America");
        plant2.setHeight(1.8);
        plant2.setEdible("Yes");

        Plant plant3 = new Plant();
        plant3.setName("Radishes");
        plant3.setLatinNamea("Raphanus sativus");
        plant3.setPlantLife(true);
        plant3.setLocation("Whole world");
        plant3.setHeight(0.28);
        plant3.setEdible("Yes");

        Plant plant4 = new Plant("Tomato", "Solanum lycopersicum", true, "Whole world",1.2192,"Yes"  );
        Plant plant5 = new Plant("Quaking Aspen", "Populus tremuloides", false, "North America",16,"No" );
        Plant plant6 = new Plant("Sugar maple","Acer saccharum",false,"Eastern Canada and Eastern America",29,"no");
        Plant plant7 = new Plant("Cucumber","Cucumis sativus",true,"Whole world",1.524,"Yes");

    }
}


//Visi laukai turi būti private, turėti getterius ir setterius.
//konstruktoriai - 2. tuščias ir su visais fieldais.
//
//------------------------
//RAŠOM RANKA PATYS!
//________________
//
//Klasės laukai:
//Pavadinimas
//lotyniskas pavadinimas
//boolean vienmetis
//kokiam zemyne auga
//suaugusio augalo aukstis metrais.
//ar valgomas?
//
//Maine susikuriam masyvą saugoti augalams. sukuriame 4 augalus (2x2 pagal konstruktorius)
//
//prasukti ciklą
//pvz foreach ir atspausdinti augalus (naudojant toString() )
