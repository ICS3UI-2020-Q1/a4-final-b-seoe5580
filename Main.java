import java.util.Scanner;
/**
 * This program adds all of the digits in a user's number
 * 
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates a scanner for user input
    Scanner input = new Scanner(System.in);

    // Asks the user to input a positive integer
    System.out.println("Please enter a positive integer to add the digits of:");

    // gets the integer from the user
    int num = input.nextInt();

    // creates a variable
    int sum = 0;
    int remainder = 0;

    // this prompts the users to type a positive integer if the number is less than 1
    while(num < 1){
      System.out.println("Please enter a positive integer");
      num = input.nextInt();
    }
    
    // this does the calculation for the sum of each digit in a positive integer
    while(num > 0){
      remainder = num % 10;
      num = num / 10;
      sum = sum + remainder;
    }
    System.out.println("The sum of these digits is " + sum);

  }
}
