package org.example;

import org.example.task1.MessageRunnable;
import org.example.task1.TimeCounter;
import org.example.task1.TimerRunnable;
import org.example.task2.*;

public class Main {
    public static void main(String[] args) {
        //task1
        (new TimeCounter()).countTime();
        //task2
        (new FizzBuzz(10)).doFizzBuzz();


    }

}