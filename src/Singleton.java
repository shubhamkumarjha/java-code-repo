public class Singleton {

    private static Singleton singleton;

    private Singleton() {
        System.out.println("Singleton is Instantiated.");
    }

    public static Singleton getInstance(){
        if (singleton==null)
            singleton = new Singleton();
        return singleton;
    }

}
