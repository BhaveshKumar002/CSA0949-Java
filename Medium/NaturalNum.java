public class NaturalNumbers {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberPrinter(1));
        Thread t2 = new Thread(new NumberPrinter(2));
        Thread t3 = new Thread(new NumberPrinter(3));
        
        t1.start();
        t2.start();
        t3.start();
    }
}

class NumberPrinter implements Runnable {
    private int threadId;

    public NumberPrinter(int threadId) {
        this.threadId = threadId;
    }

    public void run() {
        for (int i = threadId; i <= 30; i += 3) {
            System.out.println("Thread " + threadId + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
