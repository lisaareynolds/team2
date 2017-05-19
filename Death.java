import java.util.Random;

public class Death
{
    public static void Death()
    {
        Random rand = new Random();
        int saying = rand.nextInt(5) + 1;
        
        switch (saying)
        {
            case 1: System.out.println("Next time, use your head");
                    break;
            case 2: System.out.println("Don't be an idiot, you idiot");
                    break;
            case 3: System.out.println("Don't be sad, lot's of people fail at life");
                    break;
            case 4: System.out.println("There are no words");
                    break;
            case 5: System.out.println("Usually, mistakes are good as you learn from them...");
                    break;
            default: System.out.println("Class DEATH is producing errors")
                    break;
        }
        System.out.println("You died")
    }
}
