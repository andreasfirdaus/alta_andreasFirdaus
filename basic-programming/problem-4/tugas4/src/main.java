

import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(" input number bilangan : ");
        int number = input.nextInt();

        System.out.println(primaNumber(number));
    }
    private static boolean primaNumber(int number)
    {
        int bilangan = 0;
        for (int i = 1; i <=number ; i++) {
            if (number%i==0)
            {
                bilangan= bilangan+1;
            }
        }

        if (bilangan == 2)
        {
            return true;
        }
        else
        {
            return false;
        }



    }
}
