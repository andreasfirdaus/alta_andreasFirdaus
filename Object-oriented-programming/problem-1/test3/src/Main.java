public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("=============== PERSEGI  =============");
        Persegi objekPersegi1 = new Persegi(4);
        objekPersegi1.hitungLuasPersegi();
        System.out.println("Luas : " + "\n" + objekPersegi1.hitungLuasPersegi() );

        Persegi objekPersegi2 = new Persegi(4);
        objekPersegi2.hitungKelilingPersegi();
        System.out.println("Keliling : " + "\n" + objekPersegi2.hitungKelilingPersegi());


        System.out.println("=============== SEGITIGA  =============");
        Segitiga objekSegitiga1 = new Segitiga(3,4);
        objekSegitiga1.hitungLuasSegitiga();
        System.out.println("Luas : " + "\n" + objekSegitiga1.hitungLuasSegitiga() );

        Segitiga objekSegitiga2 = new Segitiga(3,4);
        objekSegitiga2.hitungKelilingSegitiga();
        System.out.println("Keliling : " + "\n" + objekSegitiga2.hitungKelilingSegitiga());


        System.out.println("============ PERSEGI PANJANG  =============");
        PersegiPanjang objekPersegiPanjang1 = new PersegiPanjang(7,8);
        objekPersegiPanjang1.hitungLuasPersegiPanjang();
        System.out.println("Luas : " + "\n" + objekPersegiPanjang1.hitungLuasPersegiPanjang());

        PersegiPanjang objekPersegiPanjang2 = new PersegiPanjang(7,8);
        objekPersegiPanjang2.hitungKelilingPersegiPanjang();
        System.out.println("Keliling : " + "\n" + objekPersegiPanjang2.hitungKelilingPersegiPanjang());

    }
}