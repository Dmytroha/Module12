package org.example.task2;

import java.util.concurrent.atomic.AtomicBoolean;

public class ProcessThread extends Thread{

    private AtomicBoolean isProcessed = new AtomicBoolean(true);
    private int number;
    private NumberChecker checker;

    public ProcessThread(NumberChecker checker){
        this.checker=checker;
    }
    public void process(int a) {
        this.number = a;
        isProcessed.set(false);
    }
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (isProcessed.get()) {
                continue;
            }

            checker.check(number);
            isProcessed.set(true);
        }
    }

    public AtomicBoolean getIsProcessed() {
        return isProcessed;
    }

}
