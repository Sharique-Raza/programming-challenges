package Threads;

public enum  TrafficColor {
    RED(9000),YELLOW(3000),GREEN(1000);

    public final int timeinmiliis;

    TrafficColor(int timeinmiliis) {
        this.timeinmiliis = timeinmiliis;
    }


}

