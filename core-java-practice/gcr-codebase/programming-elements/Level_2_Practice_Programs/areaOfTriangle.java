package Level_2_Practice_Programs;
import java.util.Scanner;
class areaOfTriangle {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        float height = input.nextFloat();
        System.out.print("Enter base in cm: ");
        float base = input.nextFloat();
        float areaSqCm = 0.5f * base * height;
        float areaSqIn = areaSqCm / 6.4516f;
        System.out.println("The Area of the triangle in sq cm is " + String.format("%.2f", areaSqCm) + " and sq in is " + String.format("%.2f", areaSqIn));
        input.close();
    }
}
