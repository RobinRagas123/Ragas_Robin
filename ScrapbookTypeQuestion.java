
package scrapbook.type.question;

import java.util.Scanner;

public class ScrapbookTypeQuestion {
   
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Please Answer the Following Questions.");
      
      System.out.println("What is your Name? ");
      String quest1 = scanner.nextLine();
      
      System.out.println("What is your Age?");
      String quest2 = scanner.nextLine();
      
      System.out.println("Where do you live?");
      String quest3 = scanner.nextLine();
      
      System.out.println("What is your favorite place?");
      String quest4 = scanner.nextLine();
      
      System.out.println("What is your least favorite place?");
      String quest5 = scanner.nextLine();
      
      System.out.println("What makes you really happy?");
      String quest6 = scanner.nextLine();
      
      System.out.println("What makes you really sad?");
      String quest7 = scanner.nextLine();
      
      System.out.println("What makes you really angry?");
      String quest8 = scanner.nextLine();
      
      System.out.println("What is your favorite day? ");
      String quest9 = scanner.nextLine();
      
      System.out.println("What makes you being you?");
      String quest10 = scanner.nextLine();
      
      System.out.println("_______________________________________________________");
      System.out.println("In Summary:");
      System.out.println("Name: " + quest1);
      System.out.println("Age: " + quest2);
      System.out.println("Address: " + quest3);
      System.out.println("Favorite Place" + quest4);
      System.out.println("Least Favorite Place" + quest5);
      System.out.println("Things that makes you happy: " + quest6);
      System.out.println("Things that make you sad: " + quest7);
      System.out.println("Things that make you angry:" + quest8);
      System.out.println("Favorite Day:" + quest9);
      System.out.println("You being you: " + quest10);
      
      System.out.println("Thank you! Goodbye for now!");
      
    }
    
}