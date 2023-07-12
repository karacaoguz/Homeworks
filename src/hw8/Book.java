package hw8;

public class Book {
    Author author;
    String title;
    int pageCount;
    String type;
    boolean hardCover;
    int currentPage;

    public Book(Author author, String title, int pageCount, String type, boolean hardCover, int currentPage) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.type = type;
        this.hardCover = hardCover;
        this.currentPage = currentPage;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHardCover() {
        return hardCover;
    }

    public void setHardCover(boolean hardCover) {
        this.hardCover = hardCover;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
