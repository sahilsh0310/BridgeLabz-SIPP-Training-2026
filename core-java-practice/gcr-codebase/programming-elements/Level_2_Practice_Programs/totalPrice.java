package Level_2_Practice_Programs;

import java.util.Scanner;

public class totalPrice {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double price = input.nextDouble();
        int quantity = input.nextInt();
        double totalPrice = price*quantity;

        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + price + "\n");
        input.close();
    }
}
