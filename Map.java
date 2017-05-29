public class Map
{
    public static void Map(int currentx, int currenty)
    {
        System.out.println(" _________");
        if (currenty == 1)
        {
            if (currentx == 1)
            {
                System.out.println("| X       |");
            }
            else if (currentx == 2)
            {
                System.out.println("|    X    |");
            }
            else
            {
                System.out.println("|       X |");

            }
            System.out.println("|         |");
            System.out.println("|____ ____|");
        }
        else if (currenty == 2)
        {
            System.out.println("|         |");
            if (currentx == 1)
            {
                System.out.println("| X       |");
            }
            else if (currentx == 2)
            {
                System.out.println("|    X    |");
            }
            else
            {
                System.out.println("|       X |");
            }
            System.out.println("|____ ____|");
        }
        else
        {
            System.out.println("|         |");
            System.out.println("|         |");
            if (currentx == 1)
            {
                System.out.println("|_X__ ____|");
            }
            else if (currentx == 2)
            {
                System.out.println("|____X____|");
            }
            else
            {
                System.out.println("|____ __X_|");
            }
        }
        System.out.println("    |=|    n");
        System.out.println("    | |  w + e");
        System.out.println("     ?     s");
    }
}
