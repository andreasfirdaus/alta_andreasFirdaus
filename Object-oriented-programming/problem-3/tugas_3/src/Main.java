public class Main {
    public static void main(String[] args) {
        Pejumlahan pejumlahan = new Pejumlahan();
        pejumlahan.setAngka1(3);
        pejumlahan.setAngka2(4);
        System.out.println("hasil pejumlahan : " + pejumlahan.hitungPenjumlahan());

        Pembagian pembagian = new Pembagian();
        pembagian.setAngka1(12);
        pembagian.setAngka2(3);
        System.out.println("hasil pembagian : " + pembagian.hitungPembagian());

        Pengurangan pengurangan = new Pengurangan();
        pengurangan.setAngka1(15);
        pengurangan.setAngka2(4);
        System.out.println("hasil pengurangan : " + pengurangan.hitungPengurangan());

        Perkalian perkalian = new Perkalian();
        perkalian.setAngka1(10);
        perkalian.setAngka2(10);
        System.out.println("hasil perkalian : " + perkalian.hitungPerkalian());
    }
}