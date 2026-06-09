package Level_1_Practice_Programs;

public class ProfitAndLoss {
    public static void main(String[] args) {
        double CP = 129;
        double SP = 191;
        double Profit = SP - CP;
        double ProfitPercent = (Profit/CP) * 100;
        System.out.println("The Cost Price is INR " + CP + " and Selling Price is INR " + SP + "\nThe Profit is INR " + Profit + " and the Profit Percentage is " + ProfitPercent + "%\n");
    }
}
