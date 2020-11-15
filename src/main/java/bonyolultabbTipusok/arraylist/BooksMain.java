package bonyolultabbTipusok.arraylist;

public class BooksMain {
    public static void main(String[] args) {
        Books books = new Books();
        books.add("Gone with the wind");
        books.add("Gone with the snow");
        books.add("Gone with the ice");
        books.add("Snow White");
        books.add("Go Johnny");
        books.add("Holy Bible");
        System.out.println(books.findAllByPrefix("Go"));
        System.out.println(books.getTitles());
    }
}
