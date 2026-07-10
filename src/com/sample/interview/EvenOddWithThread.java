package com.sample.interview;

public class EvenOddWithThread {

    private final int limit;
    private int counter = 1;

    EvenOddWithThread(int limit) {
        this.limit = limit;
    }

    public static void main(String[] args) {
        EvenOddWithThread printer = new EvenOddWithThread(10);

        Thread t1 = new Thread(printer::oddNumber, "oddThread");
        Thread t2 = new Thread(printer::evenNumber, "evenThread");

        t1.start();
        t2.start();
    }



    private synchronized void evenNumber() {
        while (counter <= limit) {
            while (counter % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (counter <= limit) {
                System.out.print(counter+" ");
                counter++;
                notifyAll();
            }
        }
    }

    private synchronized void oddNumber() {
        while (counter <= limit) {
            while (counter % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (counter <= limit) {
                System.out.print(counter + " ");
                counter++;
                notifyAll();
            }
        }
    }
}
