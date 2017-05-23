import java.util.Scanner;

/**
 * Created by atho9080 on 5/23/2017.
 */
public class Move
{
    public static int Move(int currentx, int currenty)
    {
        Scanner in = new Scanner(System.in);
        boolean errorCheck = false;

        //int[][] location = new int[10][10];//{1,2,3,4,5,6}}; //FOR THIS, PUT 0 IN ALL THE PLACES YOU CANNOT GO TO
        int[][] location =  
                   {{1,1,1,0,0,0,0,0,0,0}, //REMEMBER TO PUT THIS IN THE MAIN CLASS AS WELL, or not idk
                    {1,1,1,0,0,0,0,0,0,0},
                    {1,1,1,0,0,0,0,0,0,0},
                    {1,1,1,0,0,0,0,0,0,0},
                    {1,1,1,0,0,0,0,0,0,0},
                    {1,1,1,0,0,0,0,0,0,0},
                    {1,1,1,0,0,0,0,0,0,0},
                    {1,1,1,0,0,0,0,0,0,0},
                    {1,1,1,0,0,0,0,0,0,0},
                    {1,1,1,0,0,0,0,0,0,0}};

        String input = in.nextLine();
        if (input.toLowerCase().equals("north")) //might want to make this a switch statement later
        {
            if (location[currentx][currenty + 1] == 0)
            {
                System.out.println("You cannot go that way");
                return currenty; //returns the same value, as you did not move, so that you exit out of the method
            }
            else
            {
                currenty = currenty+1;
                return currenty;
            }
        }
        else if (input.toLowerCase().equals("south"))
        {
            if (location[currentx][currenty - 1] == 0)
            {
                System.out.println("You cannot go that way");
                return currenty;
            }
            else
            {
                currenty = currenty-1;
                return currenty;
            }
        }
        else if (input.toLowerCase().equals("east"))
        {
            if (location[currentx - 1][currenty] == 0)
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
        else if (input.toLowerCase().equals("west"))
        {
            if (location[currentx + 1][currenty] == 0)
            {
                System.out.println("You cannot go that way");
                return currenty;
            }
            else
            {
                currentx = currentx + 1;
                return currentx;
            }
        }
        else
        {
            System.out.println("Not a correct direction");
            return currenty;
        }
    }
}
