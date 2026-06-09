import java.util.Scanner;
public class kingdomTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        double income = sc.nextDouble();
        double taxAmount;
        String taxBracket;

        if (income < 10000) {
            taxBracket = "5%";
            taxAmount = income * 0.05;
        } else if (income <= 50000) {
            taxBracket = "15%";
            taxAmount = income * 0.15;
        } else {
            taxBracket = "30%";
            taxAmount = income * 0.30;
        }
        System.out.println("Tax Bracket: " + taxBracket);
        System.out.println("Tax Amount: Rs." + taxAmount);

        sc.close();
    }
}

