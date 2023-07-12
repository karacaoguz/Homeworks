package hw8;

public class Reader {
    String name;
    int age;
    String sex;

    public Reader(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void read(Book book) {
        System.out.println(name + " is reading " + book.title);
        book.currentPage++;
    }
    public void readPage(Book book, int x) {
        System.out.println(name + " read " + x + " pages");
        book.setCurrentPage(book.currentPage + x);
    }
}
