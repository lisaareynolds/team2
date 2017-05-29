import java.util.Scanner;

/**
 * Created by thomsen on 5/29/2017.
 */
public class Inspect
{
    public static boolean Inspect(int currentx, int currenty, int health)
    {
        Scanner in = new Scanner(System.in);
        if (currentx == 1 && currenty == 1)
        {
            System.out.println("You find a first aid kit attached to the wall behind the empty boxes");
            System.out.println("Use the first aid kit?");
            String input = in.nextLine();
            if (input.toLowerCase().equals("yes") || input.toLowerCase().equals("y") || input.toLowerCase().equals("use"))
            {
                return true;
            }
            else
            {
                System.out.println("You don't use the first aid kit");
            }
        }
        else if (currentx == 2 && currenty == 3)
        {
            System.out.println("On the wall there is a flickering screen. Between each flash you can make out these words: \n SECUTIRY QUESTION- It is greater than God and more evil than the devil. The poor have it, the rich need it, and if you eat it you’ll die.");
            System.out.println("Any guesses?");
            String input = in.nextLine();
            if (input.toLowerCase().equals("nothing"))
            {
                System.out.println("The screen flashes \"Correct!\", and the door opens");
                return true;
            }
            else
            {
                System.out.println("The screen flashes \"Incorrect!\"");
            }
        }
        else
        {
            System.out.println("There is nothing to inspect here!");
        }
        return false;
    }
}
