/**
 * Created by atho9080 on 5/23/2017.
 */
public class Move
{
    public static int X(int currentx, int currenty, boolean direction) //changes the Y axis
    {
        int[][] location = {
                {0,0,0,0,0},
                {0,1,1,1,0},
                {0,1,1,1,2},
                {0,1,1,1,0},
                {0,0,0,0,0}}; //add a 2 value later

        if (location[currentx][currenty] == 0)
        {
            System.out.println("You cannot go that way");
            if (direction)
            {
                return currentx - 1;
            }
            else
            {
                return currentx + 1;
            }
        }
        else
        {
            return currentx;
        }
    }
    public static int Y(int currentx, int currenty, boolean direction, boolean door) //changes the Y axis
    {
        int[][] location = {
                {0,0,0,0,0},
                {0,1,1,1,0},
                {0,1,1,1,2}, //map is on it's side, so technically the 2 is on the south side
                {0,1,1,1,0},
                {0,0,0,0,0}};

        if (location[currentx][currenty] != 1)
        {
            if (location[currentx][currenty] == 2 && door)
            {
                System.out.println("You left the room");
                return 100; //100 is the variable that ends the game
            }
            System.out.println("You cannot go that way");
            if (direction)
            {
                return currenty + 1;
            }
            else
            {
                return currenty - 1;
            }
        }

        else
        {
            return currenty;
        }
    }
}
