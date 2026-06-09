package Level_1_Practice_Programs;
import java.util.Scanner;
class heightConvert {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in centimeters: ");
        double heightInCm = input.nextDouble();
        double totalInches = heightInCm / 2.54;
        int feet = (int) totalInches / 12;
        double inches = totalInches % 12;
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + String.format("%.2f", inches));
        input.close();
    }
}
