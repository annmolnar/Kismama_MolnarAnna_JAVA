package osztalyokEsObjektumok.objects;

import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
      Book book1 = new Book();
        System.out.println(book1);

        Book emptyBook = null;
        System.out.println(emptyBook);
        System.out.println(emptyBook == null);

        Book book = book1;
        System.out.println(book);
        book = null;
        System.out.println(book);
        book = new Book();
        System.out.println(book);

        Book anotherBook = new Book();
        System.out.println(book == anotherBook);
        anotherBook = book;
        System.out.println(book == anotherBook);
        System.out.println(anotherBook instanceof Book);

        Book tarzan = new Book();
        Book jane = new Book();
        Book clayton = new Book();



        Book [] books = {tarzan, jane, clayton };
        List<Book> bookList =Arrays.asList(tarzan, jane, clayton);
        List<Book> bookList2;



    }

}
