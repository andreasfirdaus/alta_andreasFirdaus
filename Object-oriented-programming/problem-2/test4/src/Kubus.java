public class Kubus {
    int sisi;

    public Kubus(int sisi)
    {
        this.sisi = sisi;
    }

    public int hitungVolumeKubus()
    {
        int volume = this.sisi* this.sisi* this.sisi;
        return volume;
    }

}

