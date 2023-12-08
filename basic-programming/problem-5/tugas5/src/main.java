import java.util.Scanner;
public class main {
    public static void main(String[] args)
    {
        String original, reverse = "";
        Scanner input = new Scanner(System.in);
        System.out.println("silahkan input teks untuk di cek : ");
        original = input.nextLine();

        int length = original.length();
        for (int x = length-1; x >=0 ; x--)
        {
            reverse = reverse + original.charAt(x);
        }

        if (original.equals(reverse))
        {
            System.out.println("polindrome");
        }else {
            System.out.println("bukan polindrome");
        }
    }
//    public static boolean Palindrome(String value)
//    {
//
//    }
}
