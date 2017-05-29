import java.util.Scanner;

public class PorkMainFile
{
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException
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
        System.out.println("NOTE: This is a WIP, and only one room has been implemented\n");
        System.out.println("Type \"help\" for list of commands");

        String surroundings =   "You are trapped alone in a metal room, with only your clothes and a compass you found on the floor. \n" +
                                "In the north-west corner of the room, there is a large pile of boxes, and on the southern wall there is a door, the only way out";
        System.out.println(surroundings);

        int currentx = 2; //where you start, across
        int currenty = 2; //where you start, up and down
        String item = "nothing";
        int health = 5;

        /**
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
         **/

        while (finished == false)
        {
            String input = in.nextLine();
            

            if (input.toLowerCase().equals("credits")) //first couple classes don't use any other classes
            {
                System.out.println("By Alex Thomsen, Luke Mendes, Andy Hsu, That Bryson Guy");
            }
            else if (input.toLowerCase().equals("help"))
            {
                System.out.println("Command List: credits, help, inspect, map, move, stats, suicide");
            }
            else if (input.toLowerCase().equals("surroundings"))
            {
                System.out.println(surroundings);
            }
            else if (input.toLowerCase().equals("map")) //after this classes uses other classes
            {
                Map.Map(currentx, currenty); //calls the class to run the action (CLASS NOT MADE YET)
            }
            else if (input.toLowerCase().equals("move"))
            {
                System.out.println("Which direction? ");
                String direction = in.nextLine();
                if (direction.toLowerCase().equals("west"))
                {
                    currentx = Move.X(currentx - 1,currenty, false);
                }
                else if (direction.toLowerCase().equals("east"))
                {
                    currentx = Move.X(currentx + 1,currenty, true);
                }
                else if (direction.toLowerCase().equals("north"))
                {
                    currenty = Move.Y(currentx,currenty - 1, true);
                }
                else if (direction.toLowerCase().equals("south"))
                {
                    currenty = Move.Y(currentx,currenty + 1, false);
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
            else if (input.toLowerCase().equals("inspect"))
            {
                //inspect(location); //can't finish because there is no layout yet
            }
            else if (input.toLowerCase().equals("suicide"))
            {
                Death.Death("Edgy");
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
