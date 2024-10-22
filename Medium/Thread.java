public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Child thread started: " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Child thread finished: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread childThread = new MyThread("Child Thread");
        childThread.start();

        System.out.println("Main thread started");
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread finished");
    }
}
