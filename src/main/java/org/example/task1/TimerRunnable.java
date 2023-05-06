package org.example.task1;

import java.util.concurrent.TimeUnit;

public class TimerRunnable implements Runnable {
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        while (true) {
            long currentTime = System.currentTimeMillis();
            long elapsedTime = currentTime - startTime;

            System.out.println("Прошло " + TimeUnit.MILLISECONDS.toSeconds(elapsedTime) + " секунд");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //e.printStackTrace();
                System.out.println("-----TimerRunnable Interrupted----");

            }
        }
    }
}

