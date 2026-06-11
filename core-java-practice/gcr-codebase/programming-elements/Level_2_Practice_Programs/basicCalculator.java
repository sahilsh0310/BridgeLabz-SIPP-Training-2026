package Level_2_Practice_Programs;
import java.util.Scanner;
public class basicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float A =  input.nextFloat();
        float B = input.nextFloat();

        float Addition = (A+B);
        float Subtraction = (A-B);
        float Multiplication = (A*B);
        float Division = (A/B);

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + A + " and " + B + " is " + Addition + ", " + Subtraction + ", " + Multiplication + ", and " + Division);
        input.close();
    }
}
