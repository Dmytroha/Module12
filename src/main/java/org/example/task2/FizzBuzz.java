package org.example.task2;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private int NumbersCount;

    public FizzBuzz(int NumbersCount ) {
        this.NumbersCount=NumbersCount;
    }

 public void doFizzBuzz(){

     ProcessThread fizzProcessor = new ProcessThread((n) -> {
         if (n % 3 == 0) {
             System.out.println("FIZZ");
         }
     });
     ProcessThread buzzProcessor = new ProcessThread((n) -> {
         if (n % 5 == 0) {
             System.out.println("BUZZ");
         }
     });
     ProcessThread fizzBuzzProcessor = new ProcessThread((n) -> {
         if (n % 5 == 0 && n % 3 == 0) {
             System.out.println("FIZZ-BUZZ");
         }
     });
     ProcessThread defaultProcessor = new ProcessThread((n) -> {
         if (n % 5 != 0 && n % 3 != 0) {
             System.out.println(n);
         }
     });

     List<ProcessThread> threads = new ArrayList<>();
     threads.add(fizzBuzzProcessor);
     threads.add(fizzProcessor);
     threads.add(buzzProcessor);
     threads.add(defaultProcessor);

     for (ProcessThread thread : threads) {
         thread.start();
     }

     for (int i = 1; i < NumbersCount+1; i++) {
         for (ProcessThread thread : threads) {
             thread.process(i);
         }

         while (true) {
             int processedCount = 0;
             for (ProcessThread thread : threads) {
                 if(thread.getIsProcessed().get()) {
                     processedCount++;
                 }
             }
             if (processedCount == threads.size()) {
                 break;
             }
         }
     }


 }

}
