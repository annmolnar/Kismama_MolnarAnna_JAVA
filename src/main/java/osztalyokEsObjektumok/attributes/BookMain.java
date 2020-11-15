package osztalyokEsObjektumok.attributes;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Édes Anna");
        book1.setTitle("Édes Réka");
        System.out.println(book1.getTitle());
    }
}
