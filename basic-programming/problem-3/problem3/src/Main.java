
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //inisialisasi variabel grade
        String grade;

        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nilai 0 - 100 :");
        int inputAngka = input.nextInt();

        // USER INPUT NILAI 80 - 100
        if (inputAngka>=80 && inputAngka <=100)
        {
            grade="A";
            System.out.println("Nilai anda :" + grade);
        }

        // USER INPUT NILAI 65 - 79
        else if (inputAngka >=65 && inputAngka <=79)
        {
            grade="B+";
            System.out.println("Nilai anda :" +grade);
        }

        // USER INPUT NILAI 50 - 64
        else if (inputAngka >=50 && inputAngka <=64)
        {
            grade="B";
            System.out.println("Nilai anda :" +grade);
        }

        // USER INPUT NILAI 35 - 49
        else if (inputAngka >=35 && inputAngka <=49)
        {
            grade="C";
            System.out.println("Nilai anda :" +grade);
        }

        // USER INPUT NILAI 0 - 34
        else if (inputAngka >=0 && inputAngka <=34)
        {
            grade="D";
            System.out.println("Nilai anda :" +grade);
        }

        // USER INPUT NILAI -1 / 101
        else
        {
            System.out.println("Invalid");
        }
    }
}