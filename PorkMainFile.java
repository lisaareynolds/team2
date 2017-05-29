import java.util.Scanner;

public class PorkMainFile
{
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException
    {
        Scanner in = new Scanner(System.in);
        boolean finished = false;
        int time = 15;
        boolean door = false;

        System.out.println("Version 1.0, all rights reserved");
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

        while (finished == false) {
            String input = in.nextLine();
            input = input.toLowerCase();
            boolean action = true;

            switch (input)
            {
                case "credits":
                    System.out.println("By Alex Thomsen, Luke Mendes, Andy Hsu, That Bryson Guy");
                    action = false;
                    break;
                case "help":
                    System.out.println("Command List: credits, help, inspect, map, move, stats, suicide, surroundings, quit");
                    action = false;
                    break;
                case "surroundings":
                    System.out.println(surroundings);
                    action = false;
                    break;
                case "map":
                    Map.Map(currentx, currenty);
                    action = false;
                    break;
                case "move":
                    System.out.println("Which direction? ");
                    String direction = in.nextLine();
                    if (direction.toLowerCase().equals("west") || direction.toLowerCase().equals("w")) {
                        currentx = Move.X(currentx - 1, currenty, false);
                    } else if (direction.toLowerCase().equals("east") || direction.toLowerCase().equals("e")) {
                        currentx = Move.X(currentx + 1, currenty, true);
                    } else if (direction.toLowerCase().equals("north") || direction.toLowerCase().equals("n")) {
                        currenty = Move.Y(currentx, currenty - 1, true, door);
                    } else if (direction.toLowerCase().equals("south") || direction.toLowerCase().equals("s")) {
                        currenty = Move.Y(currentx, currenty + 1, false, door);
                        if (currenty == 100)
                        {
                            System.out.println("More content will be added later (maybe...) (probably not...)");
                            finished = true;
                            break;
                        }
                    } else {
                        System.out.println("Not a correct direction");
                        action = false;
                    }
                    System.out.println("Current x value: " + currentx);
                    System.out.println("Current y value: " + currenty);
                    break;
                case "stats":
                    Stats.Stats(health, item);
                    action = false;
                    break;
                case "inspect":
                    if (currentx == 1)
                    {
                        boolean type = Inspect.Inspect(currentx, currenty, health);
                        if (type == true)
                        {
                            if (health == 5)
                            {
                                System.out.println("You already have full health!");
                            }
                            else
                            {
                                System.out.println("You used the first aid kit (+1 health)");
                                health = health + 1;
                            }
                        }
                    }
                    else
                    {
                        door = Inspect.Inspect(currentx, currenty, health);
                    }
                    break;
                case "suicide":
                    Death.Death("Edgy");
                    finished = true;
                    break;
                case "quit":
                    finished = true;
                    System.out.println("Coward");
                    break;
                default:
                    System.out.println("That is not a command, type \"help\" for list of commands");
                    action = false;
                    break;
            }
            if (action == true)
            {
                time = time - 1;
            }
            switch (time)
            {
                case 5:
                    System.out.println("Suddenly, the vents above turn on, and a greenish gas starts spilling out.");
                    break;
                case 4:
                    System.out.println("You begin to choke on the gas (-1 health)");
                    health = health - 1;
                    break;
                case 3:
                    System.out.println("The gas rises.  Yours eyes begin to burn (-1 health)");
                    health = health - 1;
                    break;
                case 2:
                    System.out.println("You start coughing up blood (-1 health)");
                    health = health - 1;
                    break;
                case 1:
                    System.out.println("Your skin is cracking and you can barely see (-1 health)");
                    health = health - 1;
                    break;
                case 0:
                    System.out.println("You can barely see through the blood that now covers your eyes (-1 health)");
                    health = health - 1;
                    break;
                case -1:
                    System.out.println("Suddenly, the gas is sucked out of the room.  You barely survived");
                    time = 100;
                    break;
            }
            if (health == 0)
            {
                Death.Death("Well that didn't work out");
                finished = true;
            }
        }
        System.out.println("Thank you for playing");
    }
}
