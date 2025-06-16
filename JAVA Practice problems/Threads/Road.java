package Threads;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        TrafficSignal t1 = new TrafficSignal(TrafficColor.RED);
        TrafficSignal t2 = new TrafficSignal(TrafficColor.YELLOW);
        TrafficSignal t3 = new TrafficSignal(TrafficColor.GREEN);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

    }
}
