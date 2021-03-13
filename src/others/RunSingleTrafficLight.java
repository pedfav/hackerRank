package others;

public class RunSingleTrafficLight {
    public static void main(String[] args) throws InterruptedException {
        while(true) {
            for (TrafficLight trafficLight: TrafficLight.values()) {
                System.out.println(trafficLight);
                Thread.sleep(trafficLight.getTime());
            }
        }
    }
}
