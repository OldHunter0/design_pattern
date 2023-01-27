package singleton;

//懒汉，线程安全
public class SingleObject {
    private static SingleObject instance;

    private SingleObject() {
    }

    public static synchronized SingleObject getInstance() {
        if (instance == null) {
            instance = new SingleObject();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton V1: Hello, World!");
    }
}
