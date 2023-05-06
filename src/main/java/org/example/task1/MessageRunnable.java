package org.example.task1;

public class MessageRunnable implements Runnable{

    private final Thread timerThread;

    public MessageRunnable(Thread timerThread) {
        this.timerThread = timerThread;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // ждем 5 секунд
                Thread.sleep(5000);

                // оповещаем поток отсчета времени
                timerThread.interrupt();

                System.out.println("Прошло 5 секунд");
            } catch (InterruptedException e) {
                // пропускаем исключение
                System.out.println("-----MessageRunnable Interrupded----");
            }
        }
    }

}
