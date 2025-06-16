package Threads;

public class TrafficSignal extends Thread {
    private final TrafficColor color;


    public TrafficSignal(TrafficColor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s IS ACTIVE\n ",color);
        try {
            Thread.sleep((color.timeinmiliis));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s IS INACTIVE\n",color);
    }
}