import java.util.*;
import java.lang.Math;

/* 
 * Author: Hahnbee Lee
 * Date: 10/01/17
 * 
 * Programming Assigment 2 Restaurant Food Ordering System
 * Due 10/01/17
 * 
 * Program Description: calculate the total cost of a chosen number of variables
 * 
 * Honor Code: No joint work is permitted for some assesments such as Programming Assignments (PAs) and exams, any submitted work must be yours alone.
               Honor code violation may result in failing the course or referral to the Honor Committee.
 * 
 */

public class RFOS{
 
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    //print menu
    System.out.println("\t Hahnbee's BBQ Shack\n \t Item \t Price (in dollars)");
    System.out.println("1 Hamburger \t  4.55 \n2 Cheeseburger\t  4.75");
    System.out.println("3 BBQ wings \t 10.54 \n4 Spicy Wings \t 11.54 ");
    System.out.println("5 Fries \t\t \t  3.11 \n6 Chili Fries \t  4.15");
    System.out.println("7 Hot Dogs(2) \t  3.55 \n8 Chili Dog \t  4.05");
    System.out.println("9 Sloppy Joe \t  4.25 \n10 Milkshake \t  3.55");
    
    System.out.println("How many different dishes would you like to order today?"); //ask how # of dishes
    int numDish = input.nextInt(); //set numDish to user input
    double total = 0.00; //total price
    double servings = 0.00; //# of servings per dish
      for(int i = 1; i <= numDish; i++){
         System.out.println("Enter dish 1-10"); //ask which dish till limit 
         int dishNum = input.nextInt();
         switch(dishNum){ //switch loop that distinguishes the different prices for the different dishes
            case 1:
               System.out.println("How many servings of dish 1 would you like to order?"); //ask how many servings of that dish
               servings = input.nextInt();
               total += servings * 4.55; //add the price * amount of servings to the total price
               total = (Math.round(total * 100.0)) / 100.0; //round itt to the nearst hundreths digit
               break;
            case 2: 
               System.out.println("How many servings of dish 2 would you like to order?");
               servings = input.nextInt();
               total += servings * 4.75;
               total = (Math.round(total * 100.0)) / 100.0;
               break;
            case 3:
               System.out.println("How many servings of dish 3 would you like to order?");
               servings = input.nextInt();
               total += servings * 10.54;
               total = (Math.round(total * 100.0)) / 100.0;
               break;
            case 4:
               System.out.println("How many servings of dish 4 would you like to order?");
               servings = input.nextInt();
               total += servings * 11.54;
               total = (Math.round(total * 100.0)) / 100.0;
               break;
            case 5:
               System.out.println("How many servings of dish 5 would you like to order?");
               servings = input.nextInt();
               total += servings * 3.11;
               total = (Math.round(total * 100.0)) / 100.0;
               break;
            case 6:
               System.out.println("How many servings of dish 6 would you like to order?");
               servings = input.nextInt();
               total += servings * 4.15;
               total = (Math.round(total * 100.0)) / 100.0;
               break;
            case 7:
               System.out.println("How many servings of dish 7 would you like to order?");
               servings = input.nextInt();
               total += servings * 3.55;
               total = (Math.round(total * 100.0)) / 100.0;
               break;
            case 8:
               System.out.println("How many servings of dish 8 would you like to order?");
               servings = input.nextInt();
               total += servings * 4.05;
               total = (Math.round(total * 100.0)) / 100.0;
               break;
            case 9:
               System.out.println("How many servings of dish 9 would you like to order?");
               servings = input.nextInt();
               total += servings * 4.25;
               total = (Math.round(total * 100.0)) / 100.0;
               break;
            case 10:
               System.out.println("How many servings of dish 10 would you like to order?");
               servings = input.nextInt();
               total += servings * 3.55;
               total = (Math.round(total * 100.0)) / 100.0;
               break;
         }
      }
      System.out.println("Enter the tax %: "); //computate tax
      double tax = input.nextDouble();
      double taxTot = ((tax /100.0) * total); //change from 100 to a decimal and calculate how much tax will be added
      taxTot = (Math.round(taxTot * 100.00)) / 100.00; // round to nearest hundreths
      
      System.out.println("Do you want to add tip? ['y' - yes or 'n' - no]"); //ask if they want tip
      char tip = input.next().charAt(0); 
      
      if (tip == 'y'){ //if they want tip...
         System.out.println("Enter tip % [0-100]: "); //enter amount of tip
         double tipPercent = input.nextDouble();
         double tipTot = ((tipPercent / 100) * total); //calculate tip $
         tipTot = (Math.round(tipTot * 100.00)) / 100.00; //round to the nearst hundreths
         System.out.println("Price: " + total); //print total (w/o tip or tax)
         System.out.println("Tax: (" + tax + "%): "+ taxTot); //print amount of tax added
         System.out.println("Tip: (" + tipPercent + "%): " + tipTot); // print amount of tip added
         System.out.println("----------");
         double totAmount = taxTot + tipTot + total; //addition of all values
         totAmount = (Math.round(totAmount * 100.0)) / 100.0; //round
         System.out.println("Total Amount: " + totAmount);
      }      
      else if (tip == 'n'){ //if not tip repeat same process^ w/o tip added to the total
         System.out.println("Price: " + total);
         System.out.println("Tax: (" + tax + "%): "+ taxTot);
         System.out.println("----------");
         double totAmount = taxTot + total;
         System.out.println("Total Amount: " + totAmount); 
      }
   }            
}