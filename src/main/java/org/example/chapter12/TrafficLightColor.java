package org.example.chapter12;

public enum TrafficLightColor {
    RED(2000), GREEN(3000), YELLOW(1000);

    private int delay;

    TrafficLightColor(int d) {
        delay = d;
    }

    public int getDelay() {
        return delay;
    }
}
