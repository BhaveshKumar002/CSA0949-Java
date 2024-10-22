interface IterF1 {
    int add(int a, int b);
    int sub(int a, int b);
}

class Arithmetic implements IterF1 {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        IterF1 arithmetic = new Arithmetic();
        int sum = arithmetic.add(10, 20);
        int difference = arithmetic.sub(30, 15);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
