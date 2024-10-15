class PrimeCheckRunnable implements Runnable {
    private int number;

    public PrimeCheckRunnable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (isPrime(number)) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is not Prime");
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 5; 
        Thread primeThread = new Thread(new PrimeCheckRunnable(num));
        primeThread.start();
    }
}
