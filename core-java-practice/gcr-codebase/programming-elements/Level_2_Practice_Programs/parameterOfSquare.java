package Level_2_Practice_Programs;
import java.util.Scanner;
public class parameterOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int parameter =  input.nextInt();
        int side = parameter/4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + parameter);
        input.close();
    }
}
