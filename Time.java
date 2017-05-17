/** HOW TO USE TIME:
This class pauses the program temporarly for the given time values:

To wait x seconds:    EasyTime.Wait(x) 

Examples:
To wait 2 seconds:    EasyTime.Wait(2);
To wait 3.5 seconds:  EasyTime.Wait(3.5);

This was created for pauses when needed in "Pork"
*//

public class EasyTime
{
    public static void Wait(double waitTime)
    {
        int waitTime = waitTime * 1000; //1000 ticks is a second
        try
        {
            Thread.sleep(waitTime);
        }
        catch (InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
