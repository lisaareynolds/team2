import java.util.Scanner;

public class PorkMainFile
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean finished = false;

        int[][] location =
               {{1,1,1,0,0,0,0,0,0,0}, //map of the world (NOT COMPLETE AT ALL
                {1,1,1,0,0,0,0,0,0,0}, //1 = room?
                {1,1,1,0,0,0,0,0,0,0}, //2 = hallway?
                {1,1,1,0,0,0,0,0,0,0}, //3 = idk something
                {1,1,1,0,0,0,0,0,0,0}, //add more values for "special" rooms
                {1,1,1,0,0,0,0,0,0,0},
                {1,1,1,0,0,0,0,0,0,0},
                {1,1,1,0,0,0,0,0,0,0},
                {1,1,1,0,0,0,0,0,0,0},
                {1,1,1,0,0,0,0,0,0,0}};

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

        int currentx = 1; //where you start
        int currenty = 1; //where you start
        String item = "nothing";
        int health = 5;

        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize first element
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize first element
        anArray[0,0] = "There lies a metal table with a flickering LED screen. Between each flash you can make out these words: /n SECUTIRY QUESTION- It is greater than God and more evil than the devil. The poor have it, the rich need it, and if you eat it you’ll die. What is it? As you looked back it seemed Abligale was deep in thought, determind to figure it out";
        anArray[1,0] = "The final door, You can see your reflection in its metlaic shine. A glipse of hope, one last chance. Now if only you had the code.";
        anArray[2,0] = "In the corner of the room there's a tablet on the wall, it has a keyboard poped out. The screen is cracked, but you can make out that it needs a six letter passcode. This must be where Dr. Erskine told you to put the code. you can feel the blood pumping from your heart, desprate to get out of this hell.";
        anArray[3,0] = 0;
        anArray[4,0] = " ";
        anArray[5,0] = 600;
        anArray[6,0] = 700;
        anArray[7,0] = 800;
        anArray[8,0] = 900;
        anArray[9,0] = 1000;

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
            else if (input.toLowerCase().equals("move"))
            {
                System.out.println("Which direction? ");
                String direction = in.nextLine();
                if (direction.toLowerCase().equals("west"))
                {
                    currentx = Move.X(currentx + 1,currenty,location);
                }
                else if (direction.toLowerCase().equals("east"))
                {
                    currentx = Move.X(currentx - 1,currenty,location);
                }
                else if (direction.toLowerCase().equals("north"))
                {
                    currenty = Move.Y(currentx,currenty + 1,location);
                }
                else if (direction.toLowerCase().equals("north"))
                {
                    currenty = Move.Y(currentx,currenty - 1,location);
                }
                else
                {
                    System.out.println("Not a correct direction");
                }
                System.out.println("Current x value: " + currentx);
                System.out.println("Current y value: " + currenty);
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
