public class Balok {
    int panjang, lebar, tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int hitungVolumeBalok()
    {
        int volume = this.panjang * this.lebar * this.tinggi;
        return volume;
    }

}
