package Level_1_Practice_Programs;

public class CourseFee {
    public static void main(String[] args) {
        int Fee = 125000;
        double discountPercentage = 10;
        int discountAmount = (int) ((discountPercentage/100) * Fee);
        int FinalFee = Fee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + FinalFee + "\n");
    }
}
