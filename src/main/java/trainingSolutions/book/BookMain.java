package trainingSolutions.book;

public class BookMain {
    public static void main(String[] args) {
        Book book1= new Book("Gone with the Wind", "Margaret Mitchell");
        System.out.println(book1.getAuthor()+" "+book1.getTitle());
        book1.register("123AQAA");
        System.out.println(book1.getRegNumber());
    }
}
