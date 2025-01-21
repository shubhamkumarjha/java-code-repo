@FunctionalInterface
public interface Failable {

    public String fail();

    default String pass() {
        return null;
    }

    public static String noResult() {
        return null;
    }

    default String passer() {
        return null;
    }

    public static String noResulter() {
        return null;
    }
}
