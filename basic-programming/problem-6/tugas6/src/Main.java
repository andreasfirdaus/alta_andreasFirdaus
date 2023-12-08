import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner inputAngka = new Scanner(System.in);
        System.out.println("input perkalian");

        int angka = inputAngka.nextInt();
        System.out.println(DrawXYZ(angka));
    }

    private static String DrawXYZ(int height)
    {
        int kolomBaris = height*height;
        String teks = "";

        for(int i = 1; i <=kolomBaris; i++)
        {
            if (i%3 == 0)
            {
                teks = teks + "X";
            }

            else if (i%2 == 0)
            {
                teks = teks + "Z";
            }

            else
            {
                teks = teks + "Y";
            }

            if (i%height == 0)
            {
                teks = teks+ "\n";
            }
        }
        return teks;
    }
}