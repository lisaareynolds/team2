import java.util.Scanner;

public class PorkMainFile
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean finished = false;
        
        System.out.println("Version 0.1, all rights reserved");
        System.out.println("  ____     ___    ____    _  __");
        System.out.println(" |  _ \\   / _ \\  |  _ \\  | |/ /");
        System.out.println(" | |_) | | | | | | |_) | | ' / ");
        System.out.println(" |  __/  | |_| | |  _ <  | . \\ ");
        System.out.println(" |_|      \\___/  |_| \\_\\ |_|\\_\\");
        System.out.println("");
        System.out.println("NOTE: It is a MAJOR WIP, it doesn't even have last names\n");
        System.out.println("Type \"help\" for list of commands");

        //Time.Wait(1);
        System.out.println("INSERT STORY ELEMENTS HERE");
        
        int location = 1; //first room
        String item = "nothing";
        int health = 5;
            
        while (finished == false)
        {
            String input = in.nextLine();
            
            //CHANGE INTO A SWITCH STATEMENT FOR EASIER READABILITY
            
            if (input.toLowerCase().equals("credits")) //first couple classes don't use any other classes
            {
                System.out.println("By Alex Thomsen, Luke Mendes, Andy Hsu?, That Bryson Guy");
                System.out.println("I think this is right...");
            }
            else if (input.toLowerCase().equals("help"))
            {
                System.out.println("Command List: move, help, credits, stats, attack, inspect, suicide");
                System.out.println("move, help, ");//later make in alphabetical order
            }
            else if (input.toLowerCase().equals("map")) //after this classes uses other classes
            {
                //map(location); //calls the class to run the action (CLASS NOT MADE YET)
            }
            else if (input.toLowerCase().equals("mmve"))
            {
                //move(location);
            }
            else if (input.toLowerCase().equals("stats"))
            {
                Stats.Stats(health, item);
            }
            else if (input.toLowerCase().equals("attack"))
            {
                //attack(location);
            }
            else if (input.toLowerCase().equals("inspect"))
            {
                //inspect(location); //can't finish because there is no layout yet
            }
            else if (input.toLowerCase().equals("suicide"))
            {
                Death.Death();
                break;
            }
            else
            {
                System.out.println("That is not a command, type \"help\" for list of commands");
            }
        }

    System.out.println("Thank you for playing");
    }
}
