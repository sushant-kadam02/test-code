public class ThreadWithFactorial {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread threads[] = new Thread[10];
        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            threads[i - 1] = new Thread(
                   () -> {
                       long result = 0;
                       try {
                           result = factorial(finalI);
                       } catch (InterruptedException e) {
                           throw new RuntimeException(e);
                       }
                       System.out.println(result);
                   });
            threads[i - 1].start();
        }
        for (Thread thread: threads ) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Total time of execution : "+ (System.currentTimeMillis()-startTime));

    }

    private static long factorial(int n) throws InterruptedException {
        Thread.sleep(1000);
        long result = 1;
        for (int i = 1; i<= n; i++) {
            result *= i;
        }
        return result;
    }
}
