package Level_1_Practice_Programs;
import java.util.Scanner;
public class StudentFeeAndDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fee =  input.nextInt();
        double discountPercentage = input.nextDouble();
        double discountAmount = (discountPercentage/100) * fee;
        double finalFee = fee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee + "\n");
    }
}
