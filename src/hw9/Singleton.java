package hw9;

public class Singleton {
    private static Singleton singleton = new Singleton();
    private String name;

    private Singleton() {
        name = "Singleton";
    }

    public static Singleton getSingleton() {
        System.out.println("Singleton created");
        return singleton;
    }

    public void getName() {
        System.out.println(name);
    }
}

