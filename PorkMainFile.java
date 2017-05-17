import java.util.Scanner;

public class PorkMainFile
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Version 0.1, all rights reserved");
        System.out.println("  ____     ___    ____    _  __");
        System.out.println(" |  _ \\   / _ \\  |  _ \\  | |/ /");
        System.out.println(" | |_) | | | | | | |_) | | ' / ");
        System.out.println(" |  __/  | |_| | |  _ <  | . \\ ");
        System.out.println(" |_|      \\___/  |_| \\_\\ |_|\\_\\");
        System.out.println("");
        System.out.println("NOTE: It is a MAJOR WIP, it doesn't even have last names\n");


        Time.Wait(1);
        System.out.println("INSERT STORY ELEMENTS HERE");
        //HOW THE PROGRAM WILL WORK BASIC GUIDELINES
        //Differect actions will have seperate classes, like "Move", "Open", "Kill", ya know basic stuff like that
        //This main class will allow you to continually do different actions
        //Certain variables, like your current location and items, will be held here and passed into the action classes
        //That way, we won't have to rewrite the same dumb commands every five seconds
        
        String location = start;
        String items[] = new String[];
        
        String input = in.nextLine();
        if (action.toLowerCase() == "move")
        {
            System.out.println("What direction?");
            input = in.nextLine();
            move(location,input); //calls the class to run the action (CLASS NOT MADE YET)
        }
        
        if (action.toLowerCase() == "credits")
        {
        }
    }
}


/*
import java.util.Scanner;

public class PorkMainFile
{
    public static void main(String[] args)
    {
        //boolean confirmed = false;//USED FOR LOOPING
        //String name = "";//USED TO STORE THE NAME
        //String answer = "";

        Scanner in = new Scanner(System.in);
        System.out.println("Version 0.1, all rights reserved");
        System.out.println("  ____     ___    ____    _  __");
        System.out.println(" |  _ \\   / _ \\  |  _ \\  | |/ /");
        System.out.println(" | |_) | | | | | | |_) | | ' / ");
        System.out.println(" |  __/  | |_| | |  _ <  | . \\ ");
        System.out.println(" |_|      \\___/  |_| \\_\\ |_|\\_\\");
        System.out.println("By Alex, Luke, Andy, and Bryson");
        System.out.println("NOTE: Please feel free to put in your last names\n");
        System.out.println("Mystery Scenario loaded, because it's the only scenario");


        //========================= - Name Choosing - =========================


        System.out.println("Firstly...");

        while (confirmed == false) //DOES A DO LOOP SO YOU CAN CONFIRM YOUR NAME CHOICE
        {
            System.out.println("What is your name? ");
            name = in.nextLine();

            if (name.toLowerCase().equals("you suck"))
            {
                System.out.println("...");
                EasyTime.Wait(1);
                System.out.println("You have entered Moron");
                System.out.println("Are you sure you want to go by that name?");
                System.out.println("Y for yes, N for no");
                String pointless = in.nextLine(); //it's supposed to do nothing, it's pointless
                name = "Moron";
                confirmed = true;
            }
            else
            {
                System.out.println("You have entered " + name);
                System.out.println("Are you sure you want to go by that name?");
                System.out.println("Y for yes, N for no");
                String confirm = in.nextLine();

                if (confirm.toLowerCase().equals("n") || confirm.toLowerCase().equals("no"))
                {
                    confirmed = false;
                }
                else if (confirm.toLowerCase().equals("y") || confirm.toLowerCase().equals("yes"))
                {
                    confirmed = true;
                }
                else
                {
                    System.out.println("I have no idea what that means, so it's now your name");
                    name = confirm;
                    confirmed = true;
                }
            }
        }

        System.out.println("Your name is now " + name);
        EasyTime.Wait(2);

        //========================= - Question Number One - =========================

        System.out.println("Question #1: How was your day? ");
        answer = in.nextLine();
        if (answer.toLowerCase().equals("good"))
        {
            System.out.println("Screw you");
        }
        else if (answer.toLowerCase().equals("bad") || answer.toLowerCase().equals("horrible"))
        {
            System.out.println("Good");
        }
        else if (answer.toLowerCase().equals("sad") || answer.toLowerCase().equals("depressing"))
        {
            System.out.println("Kill yourself");
        }
        else
        {
            System.out.println("That's nice");
            EasyTime.Wait(1);
            System.out.println("Just kidding it's not");
        }
        EasyTime.Wait(3);

        //========================= - Question Number Two - =========================


        System.out.println("Well this is really boring...");
        EasyTime.Wait(3);
        System.out.println("This is only question two and I am already bored...");
        EasyTime.Wait(3);
        System.out.println("Well the next question is supposed to be \"What's you favorite color\"");
        EasyTime.Wait(1);
        System.out.println("But that's boring...");
        EasyTime.Wait(3);
        System.out.println("You know what, screw the script, I will make my own show!");
        EasyTime.Wait(1);
        System.out.println("It will be a legendary show, and it will be called");
        EasyTime.Wait(3);
        System.out.println("uhh...");
        EasyTime.Wait(3);
        System.out.println("The Legendary Show!");
        EasyTime.Wait(1);
        System.out.println("*Confused cheering in the background*");
        EasyTime.Wait(3);
        System.out.println("But what will The Legendary Show! have?");
        EasyTime.Wait(1);
        System.out.println("Hmm...");
        EasyTime.Wait(1);
        System.out.println("I have an idea!");
        EasyTime.Wait(1);
        System.out.println("Since I can only ask questions on this device, I will still ask questions");
        EasyTime.Wait(1);
        System.out.println("Sadly :(");
        EasyTime.Wait(1);
        System.out.println("But if you answer wrong someone dies!");
        EasyTime.Wait(2);
        System.out.println("*The background is strangely quiet*");
        EasyTime.Wait(3);
        System.out.println("Starting with this guy right here!");
        System.out.println("*The Host grabs a random person from the audience*");
        EasyTime.Wait(1);
        System.out.println("*It's a young boy*");
        EasyTime.Wait(3);

        System.out.println("You like this new show right? ");
        System.out.println("Y for yes, N for no");
        EasyTime.Wait(1);
        System.out.println("Because WHO CARES?!?!");
        EasyTime.Wait(1);
        System.out.println("I'm in charge now!");

        //========================= - Question Number Three? - =========================

        System.out.println("Question #3: What's 2 + 2? ");
        answer = in.nextLine();
        if (answer.equals("4") || answer.toLowerCase().equals("four"))
        {
            EasyTime.Wait(1);
            System.out.println(":(");
        }
        else if (answer.toLowerCase().equals("for"))
        {
            System.out.println("...");
            EasyTime.Wait(2);
            System.out.println("Good enough");
        }
        else if (answer.toLowerCase().equals("two") || answer.equals("2"))
        {
            System.out.println("Ha!  YOU FAILED!");
        }
        else
        {
            System.out.println("Well your an idiot");
            EasyTime.Wait(2);
            System.out.println("Lucky for you it's not you who will get punished");
        }
        EasyTime.Wait(3);
    }
}
*/
