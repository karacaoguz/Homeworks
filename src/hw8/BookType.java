package hw8;

public enum BookType {
    FICTION("Fiction"), NONFICTION("Nonfiction"), SCIENTIFIC("Scientific"), COMIC("Comic");

    final String description;

    BookType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
