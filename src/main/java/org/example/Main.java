package org.example;

import org.example.task1.MessageRunnable;
import org.example.task1.TimerRunnable;
import org.example.task2.*;

public class Main {
    public static void main(String[] args) {
      /*  Thread timerThread = new Thread(new TimerRunnable());
        Thread messageThread = new Thread(new MessageRunnable(timerThread));

        timerThread.start();
        messageThread.start();*/

        (new FizzBuzz(10)).doFizzBuzz();


    }

}