class Calculator {
    public synchronized void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public synchronized void subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public synchronized void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public synchronized void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division: Cannot divide by zero");
        }
    }
}

class AdditionThread extends Thread {
    private final Calculator calculator;
    private final int a, b;

    public AdditionThread(Calculator calculator, int a, int b) {
        this.calculator = calculator;
        this.a = a;
        this.b = b;
    }

    public void run() {
        calculator.add(a, b);
    }
}

class SubtractionThread extends Thread {
    private final Calculator calculator;
    private final int a, b;

    public SubtractionThread(Calculator calculator, int a, int b) {
        this.calculator = calculator;
        this.a = a;
        this.b = b;
    }

    public void run() {
        calculator.subtract(a, b);
    }
}

class MultiplicationThread extends Thread {
    private final Calculator calculator;
    private final int a, b;

    public MultiplicationThread(Calculator calculator, int a, int b) {
        this.calculator = calculator;
        this.a = a;
        this.b = b;
    }

    public void run() {
        calculator.multiply(a, b);
    }
}

class DivisionThread extends Thread {
    private final Calculator calculator;
    private final int a, b;

    public DivisionThread(Calculator calculator, int a, int b) {
        this.calculator = calculator;
        this.a = a;
        this.b = b;
    }

    public void run() {
        calculator.divide(a, b);
    }
}

public class MultiThreadedCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        Thread addThread = new AdditionThread(calculator, 10, 5);
        Thread subThread = new SubtractionThread(calculator, 10, 5);
        Thread mulThread = new MultiplicationThread(calculator, 10, 5);
        Thread divThread = new DivisionThread(calculator, 10, 5);

        addThread.start();
        subThread.start();
        mulThread.start();
        divThread.start();

        try {
            addThread.join();
            subThread.join();
            mulThread.join();
            divThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
