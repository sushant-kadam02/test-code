package com.sample.interview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadLockStatus {

    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {

        ExecutorService executer = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 3; i++){
            int taskId = i;
            executer.submit(()-> processTask(taskId));
        }

        checkLockStatus();

        executer.shutdown();
        try{
            if(executer.awaitTermination(10, TimeUnit.SECONDS)) {
                executer.shutdownNow();
            }
        } catch (InterruptedException e) {
            e.getMessage();
        }


    }

    private static void checkLockStatus() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Check lock status : "+lock.isLocked());
                System.out.println("Lock on which thread : "+lock.isHeldByCurrentThread());
                System.out.println("Number of queue locked waiting : "+lock.getQueueLength());
                System.out.println("Are threads waiting? " +lock.hasQueuedThread(Thread.currentThread()));
                System.out.println("------------------------------------------");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void processTask(int taskId) {
        System.out.println("Task "+taskId+" is attempting to acquire lock");
        lock.lock();
        try{
            System.out.println("Success processing task "+taskId);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
