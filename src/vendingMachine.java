import java.util.Scanner;

public class vendingMachine
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the best snack machine of your life! This machine only accepts $1 bills. Please insert money.");
        System.out.println("A1 Snickers - $1.00, A2 Chips - $2.00,  B4 Gatorade - $2.00,  C7 Reese's - $1.00, A9 Trail Mix - $3.00, \n B5 Hershey's - $2.00, G8 Granola Bar - $2.00");
        System.out.println("How many $1 bills would you like to enter?");
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        System.out.println("You have put in " + amount + " dollar bills");
        System.out.println("Please enter your selected snack.");
        Scanner input2 = new Scanner(System.in);
        String snack = input2.nextLine();
        System.out.println("You have selected " + snack + ". One moment please.");
        
    }
}
