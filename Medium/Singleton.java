public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() throws Exception {
        if (instance == null) {
            instance = new Singleton();
        } else {
            throw new Exception("Only one instance can be created.");
        }
        return instance;
    }

    public static void main(String[] args) {
        try {
            Singleton obj1 = Singleton.getInstance();
            Singleton obj2 = Singleton.getInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
