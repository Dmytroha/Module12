package org.example.task1;

public class TimeCounter {
    public void countTime(){

        Thread timerThread = new Thread(new TimerRunnable());
        Thread messageThread = new Thread(new MessageRunnable(timerThread));

        timerThread.start();
        messageThread.start();
    }
}
