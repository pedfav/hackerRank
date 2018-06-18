package ThirtyDaysOfCode.Day_14;

import java.util.Arrays;

public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public int computeDifference(){
        maximumDifference = Arrays.stream(elements).max().getAsInt() - Arrays.stream(elements).min().getAsInt();
        return maximumDifference;
    }
}
