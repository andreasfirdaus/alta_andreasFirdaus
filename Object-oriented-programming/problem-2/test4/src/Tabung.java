public class Tabung {
    int jari2, tinggi;
    double phi=3.14;

    public Tabung(int jari2, int tinggi) {
        this.phi = phi;
        this.jari2 = jari2;
        this.tinggi = tinggi;
    }

    public int hitungVolumeTabung()
    {
        int volume = (int) ((this.phi * this.jari2 * this.jari2) * this.tinggi);
        double phis = Double.valueOf(volume);
        return volume;
    }

}
