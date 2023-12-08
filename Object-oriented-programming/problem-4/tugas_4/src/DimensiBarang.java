public class DimensiBarang {
    int panjang;
    int lebar;
    int tinggi;
    int berat;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int hitungHargaPengirimanBarang()
    {
        int hasil = (panjang*lebar*tinggi)*berat/50;
        return hasil;
    }

}
