package others;

public enum TrafficLight {
    RED(5000),
    GREEN(5000),
    YELLOW(1000);

    private final int time;

    TrafficLight(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }
}
