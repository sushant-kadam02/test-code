public class ThreadSleepDemo extends Thread {

    private String transactionName;

    ThreadSleepDemo(String transactionName) {
        this.transactionName = transactionName;
    }

    @Override
    public void run() {
        System.out.println(transactionName +" transaction started");
        try {
            System.out.println("sleeping.......");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        }
        System.out.println(transactionName+ " completed.");
    }

    public static void main(String[] args) {
        ThreadSleepDemo t1 = new ThreadSleepDemo("Saving");
        ThreadSleepDemo t2 = new ThreadSleepDemo("Current");

        t1.start();
        t2.start();
    }
}
