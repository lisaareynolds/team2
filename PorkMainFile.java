import java.util.Scanner;

public class PorkMainFile
{
    public static void main(String[] args)
    {
        boolean confirmed = false;//USED FOR LOOPING
        String name = "";//USED TO STORE THE NAME
        String answer = "";

        Scanner in = new Scanner(System.in);
        System.out.println("Hello, and welcome to...");
        EasyTime.Wait(3);
        System.out.println("Pause for dramatic effect...");
        EasyTime.Wait(3);
        System.out.println("The Really Badly Written Game that isn't even a game!");
        EasyTime.Wait(1);
        System.out.println("*Cheering in the background*");
        EasyTime.Wait(2);

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
