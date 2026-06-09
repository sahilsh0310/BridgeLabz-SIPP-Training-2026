package Level_1_Practice_Programs;
import java.util.*;
public class volumeOfEarth {
    public static void main(String[] args) {
        int radius = 6378;
        double volumeOfEarth = ((double) 4 /3) * Math.PI * radius * radius * radius;
        System.out.println("The volume of earth in cubic kilometers is " + volumeOfEarth + " and cubic miles is " + (volumeOfEarth * 0.0610237));

    }
}
