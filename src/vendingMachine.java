import java.util.Scanner;

public class vendingMachine
{
    public static void main(String[] args)
    {
        System.out.println("Please insert money.");
        System.out.println("Snickers - $1.00, Chips - $2.00, Gatorade - $2.00, Reese's - $1.00, Trail Mix - $3.00, \nHershey's - $2.00, Granola Bar - $2.00");
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
    }
}
