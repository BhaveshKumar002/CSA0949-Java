class FibonacciThread extends Thread {
    public void run() {
        int a = 0, b = 1;
        System.out.println("Fibonacci series:");
        System.out.print(a + " " + b);
        for (int i = 3; i <= 10; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}

class ReverseOrderThread extends Thread {
    public void run() {
        System.out.println("Reverse order from 10 to 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        FibonacciThread fibThread = new FibonacciThread();
        ReverseOrderThread revThread = new ReverseOrderThread();

        fibThread.start();
        revThread.start();
    }
}
