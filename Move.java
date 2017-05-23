import java.util.Scanner;

/**
 * Created by atho9080 on 5/23/2017.
 */
public class Move
{
    public static int Y(int currentx, int currenty, int location[][]) //changes the Y axis
    {
        Scanner in = new Scanner(System.in);
        if (location[currentx][currenty] == 0)
        {
            System.out.println("You cannot go that way");
            return currenty;
        }
        else
        {
            currentx = currentx - 1;
            return currentx;
        }
    }
    public static int X(int currentx, int currenty, int location[][]) //changes the X axis
    {
        Scanner in = new Scanner(System.in);
        if (location[currentx][currenty] == 0)
        {
            System.out.println("You cannot go that way");
            return currenty;
        }
        else
        {
            currentx = currentx - 1;
            return currentx;
        }
    }
}
