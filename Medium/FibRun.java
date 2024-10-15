class FibonacciRunnable implements Runnable {
    private int count;

    public FibonacciRunnable(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        int a = 0, b = 1, next;
        System.out.print(a + " ");
        if (count > 1) {
            System.out.print(b + " ");
        }
        for (int i = 2; i < count; i++) {
            next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        int n = 5; 
        Thread fibThread = new Thread(new FibonacciRunnable(n));
        fibThread.start();
    }
}
