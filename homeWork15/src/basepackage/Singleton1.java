package basepackage;

/**
 * Created by Home911 on 26.06.2017.
 */
public class Singleton1 {
    private static Singleton1 ourInstance = new Singleton1();

    public static Singleton1 getInstance() {
        return ourInstance;
    }

    private Singleton1() {
    }
}
