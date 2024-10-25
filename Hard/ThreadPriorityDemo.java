class LowPriorityThread extends Thread {
    public void run() {
        System.out.println("Low-priority thread started.");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Low-priority thread running: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Low-priority thread interrupted.");
            }
        }
        System.out.println("Low-priority thread finished.");
    }
}

class HighPriorityThread extends Thread {
    public void run() {
        System.out.println("High-priority thread started.");
        for (int i = 1; i <= 5; i++) {
            System.out.println("High-priority thread running: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("High-priority thread interrupted.");
            }
        }
        System.out.println("High-priority thread finished.");
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        LowPriorityThread lowPriorityThread = new LowPriorityThread();
        HighPriorityThread highPriorityThread = new HighPriorityThread();
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        lowPriorityThread.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        highPriorityThread.start();
    }
}
