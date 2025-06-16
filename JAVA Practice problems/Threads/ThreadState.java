package Threads;

public class ThreadState extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.printf("\nfrom inside run %s",Thread.currentThread().getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ThreadState t1 = new ThreadState();
        System.out.printf("\nCreated the thread %s " , t1.getState());
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("\nThread finished %s ",t1.getState());
    }
}
