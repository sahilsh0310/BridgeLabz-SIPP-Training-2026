package Level_2_Practice_Programs;

import java.util.Scanner;
public class distanceInYardsAndMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float distanceInFeet =  input.nextFloat();
        float distanceInYards = distanceInFeet/3;
        float distanceInMiles = distanceInFeet/1760;

        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles + "\n");
        input.close();
    }
}
