public class Overload {
    public void assignValues(int a) {
        System.out.println("Value: " + a);
    }

    public void assignValues(int a, int b) {
        System.out.println("Values: " + a + ", " + b);
    }

    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.assignValues(5);
        obj.assignValues(5, 10);
    }
}
