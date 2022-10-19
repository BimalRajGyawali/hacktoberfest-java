import java.io.*;
 
public class CrownPatternExampleTwo
{
    static void crown(int length, int height)
    {
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < length; j++)
            {
                if (i == 0)
                {
                    if (j == 0 || j == height || j == length - 1)
                    {
                        System.out.print("#");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else if (i == height - 1)
                {
                    System.out.print("#");
                }
                else if ((j < i || j > height - i) &&
                        (j < height + i || j >= length - i))
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args)
    {
        int length = 30;
        int height = (length - 1) / 2;
        crown(length, height);
                 
    }
}
