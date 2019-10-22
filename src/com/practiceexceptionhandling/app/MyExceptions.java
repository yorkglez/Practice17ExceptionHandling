package com.practiceexceptionhandling.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExceptions
{
    public static void main(String[] args)
    {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int number1 = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Element 1 is "+numbers[0]);
        System.out.println("Element 2 is "+numbers[1]);
        System.out.println("Element 3 is "+numbers[2]);
        System.out.println("Element 4 is "+numbers[3]);
        System.out.println("Element 5 is "+numbers[4]);
        System.out.println("Element 6 is "+numbers[5]);
        System.out.println("Element 7 is "+numbers[6]);
        System.out.println("Element 8 is "+numbers[7]);
        System.out.println("Element 9 is "+numbers[8]);
        System.out.println("Element 10 is "+numbers[9]);

        try
        {
            System.out.println("Element 11 is "+numbers[10]);//Exception
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error! "+e.toString());
        }
        finally
        {
            System.out.println("This finally statement will be executed");
        }

        System.out.println("Element 1 is "+numbers[0]);
        System.out.println("Element 2 is "+numbers[1]);
        System.out.println("Element 3 is "+numbers[2]);


        for(int i = 0; i < 10; i++)
        {
            try
            {
                System.out.println("Input a number between 0-10: ");
                numbers[i] = in.nextInt();
            }
            catch (NumberFormatException  e)
            {
                System.out.println("Hey, the number you input is wrong. Do it again!!");
                in.next();
                i--;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Hey, the number you input is wrong. Do it again!!");
                in.next();
                i--;
            }
        }
    }
}
