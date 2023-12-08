import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Panjang :");
        int panjang = scanner.nextInt();

        System.out.println("Masukkan Lebar :");
        int lebar = scanner.nextInt();

        System.out.println("Masukkan Tinggi :");
        int tinggi = scanner.nextInt();

        System.out.println("Masukkan Berat :");
        int berat = scanner.nextInt();

     Ongkir ongkir = new Ongkir();
     ongkir.setPanjang(panjang);
     ongkir.setLebar(lebar);
     ongkir.setTinggi(tinggi);
     ongkir.setBerat(berat);
     System.out.println("Ongkos kurir : "+ ongkir.hitungHargaPengirimanBarang());
    }
}
