package hw8;

public class ReaderTest {

    public static void main(String[] args) {
        Author author = new Author("Oğuz Atay");
        Book book = new Book(author, "sss", 400, "Comic", true, 0);
        Reader reader = new Reader("Oğuz", 23, "Male");

        System.out.println(book.currentPage);
        reader.read(book);
        System.out.println(book.currentPage);

        System.out.println(book.author.getName());
        System.out.println(book.getTitle());
        System.out.println(book.getPageCount());
        System.out.println(book.getType());
        System.out.println(book.isHardCover());
        System.out.println(book.getCurrentPage());

        reader.readPage(book, 50);
        System.out.println(book.getCurrentPage());

        Book book2 = new Book(author, "xxx", 500, "Drama", false, 0);
        Reader reader2 = new Reader("Yağız", 13, "Male");
        reader2.read(book2);
        reader2.readPage(book2, 100);
        System.out.println(book2.getCurrentPage());
    }

}