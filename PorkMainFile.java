import java.util.Scanner;

public class PorkMainFile
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean finished = false;
        boolean end = false; //if false, you didn't finish the game, if true, you did
        boolean ending = false; //if false, you died, if true, you didn't
        
        System.out.println("Version 0.1, all rights reserved");
        System.out.println("  ____     ___    ____    _  __");
        System.out.println(" |  _ \\   / _ \\  |  _ \\  | |/ /");
        System.out.println(" | |_) | | | | | | |_) | | ' / ");
        System.out.println(" |  __/  | |_| | |  _ <  | . \\ ");
        System.out.println(" |_|      \\___/  |_| \\_\\ |_|\\_\\");
        System.out.println("");
        System.out.println("NOTE: It is a MAJOR WIP, it doesn't even have last names\n");
        System.out.println("Type \"help\" for list of commands");

        Time.Wait(1);
        System.out.println("INSERT STORY ELEMENTS HERE");
        //HOW THE PROGRAM WILL WORK BASIC GUIDELINES
        //Differect actions will have seperate classes, like "Move", "Open", "Kill", ya know basic stuff like that
        //This main class will allow you to continually do different actions
        //Certain variables, like your current location and items, will be held here and passed into the action classes
        //That way, we won't have to rewrite the same dumb commands every five seconds
        
        int location = 1;
        String items[] = {"None","None","None"}; //Add more items as needed
            
        while (finished == false)
        {
            String input = in.nextLine();
                
            if (input.toLowerCase().equals("credits")) //first couple classes don't use any other classes
            {
                System.out.println("By Alex Thomsen, Luke Mendes, Andy Hsu?, That Bryson Guy");
                System.out.println("I think this is right...");
            }
            else if (input.toLowerCase().equals("help"))
            {
                System.out.println("Command List:");
                System.out.println("move, help, ");//later make in alphabetical order
            }
            else if (input.toLowerCase().equals("move")) //after this classes uses other classes
            {
                System.out.println("What direction?");
                input = in.nextLine();
                //move(location,input); //calls the class to run the action (CLASS NOT MADE YET)
            }
            else if (input.toLowerCase().equals("explode")) //after this classes uses other classes
            {
                System.out.println("You just exploded");
                end = true;
                finished = true;
            }
            else
            {
                System.out.println("That is not a command, type \"help\" for list of commands");
            }
            System.out.println(input);
        }
    if (end == true)
    {
        if (ending == true)
        {
            System.out.println("\nThe End");
        }
        else
        {
            System.out.println("\nYou died");
        }
    }
    System.out.println("Thank you for playing");
    }
}
