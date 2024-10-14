class MultiplicationTable implements Runnable {
    private int number;

    MultiplicationTable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiplicationTableExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MultiplicationTable(5));
        Thread thread2 = new Thread(new MultiplicationTable(10));

        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
