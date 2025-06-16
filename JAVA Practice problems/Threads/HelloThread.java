package Threads;

public class HelloThread extends Thread {
    private final int threadNumber;

    public HelloThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf(" (%s) Hello from thread : %d \n",(i+1),threadNumber);
        }

    }

    public static void main(String[] args) {
        HelloThread t1 = new HelloThread(1);
        HelloThread t2 = new HelloThread(2);
        t1.start();
        t2.start();
    }
}