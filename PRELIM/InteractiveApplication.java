import java.util.Scanner;

public class InteractiveApplication {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      double total = 0;
      int totalQty = 0;
   
      System.out.println("Menu:\n");
      System.out.println("1. C2 = Php 100.00");
      System.out.println("2. C2 = Php 150.00");
      System.out.println("3. C3 = Php 200.00\n");
      System.out.println("Add ons:\n");
      System.out.println("1. R1 = Php 35.00");
      System.out.println("2. R2 = Php 50.00\n");
         
      while (true) {
         System.out.print("Enter your Order(1-3): ");
         int orderCode = scanner.nextInt();
      
         if (orderCode == 0) {
            break;
         }
      
         System.out.print("Quantity: ");
         int qty = scanner.nextInt();
      
         double price = 0;
      
         switch (orderCode) {
            case 1:
               price = 100.00;
               break;
            case 2:
               price = 150.00;
               break;
            case 3:
               price = 200.00;
               break;
            default:
               System.out.println("Invalid order code. Please try again.");
               continue;
         }
      
         double totalPrice = price * qty;
         total += totalPrice;
         totalQty += qty;
      
         System.out.println("Order: " + orderCode);
         System.out.println("Quantity: " + qty);
         System.out.println("Total price: $" + totalPrice);
         System.out.println();
      }
   
      double conversionRate = 56;
      double totalInPHP = total * conversionRate;
   
      System.out.println("Total quantity: " + totalQty);
      System.out.println("Total price in USD: " + total);
      System.out.println("Total price in PHP: " + totalInPHP);
   
      scanner.close();
   }
}
