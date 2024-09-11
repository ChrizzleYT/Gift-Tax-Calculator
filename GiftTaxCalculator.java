import java.util.Scanner;

public class GiftTaxCalculator {
     public static void main(String[] args) {

         // Creating variables
         Scanner sc = new Scanner(System.in);
         double valueOfGift;
         double giftTax = 0;
         int taxLowerLimit;
         double taxRate;

         // user input and assigning user input to variable
         System.out.print("Enter value of the gift: ");
         valueOfGift = Double.parseDouble(sc.nextLine());

         // Calculating gift tax
         if (valueOfGift < 5000) {
             giftTax = 0;
         } else if (valueOfGift >= 1000000) {
             taxLowerLimit = 142100;
             taxRate = 0.17;
             giftTax = taxLowerLimit + (valueOfGift - 1000000) * taxRate;
         } else if (valueOfGift >= 200000) {
             taxLowerLimit = 22100;
             taxRate = 0.15;
             giftTax = taxLowerLimit + (valueOfGift - 200000) * taxRate;
         } else if (valueOfGift >= 55000) {
             taxLowerLimit = 4700;
             taxRate = 0.12;
             giftTax = taxLowerLimit + (valueOfGift - 55000) * taxRate;
         } else if (valueOfGift >= 25000) {
             taxLowerLimit = 1700;
             taxRate = 0.10;
             giftTax = taxLowerLimit + (valueOfGift - 25000) * taxRate;
         } else if (valueOfGift >= 5000) {
             taxLowerLimit = 100;
             taxRate = 0.08;
             giftTax = taxLowerLimit + (valueOfGift - 5000) * taxRate;
         }

         // Printing gift tax
         System.out.println("The tax is $" + giftTax);

         sc.close();
     }
}
