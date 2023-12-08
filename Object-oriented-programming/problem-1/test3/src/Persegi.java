public class Persegi {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int hitungLuasPersegi()
    {
        int luas = this.sisi * this.sisi;
        return luas;
    }

    public int hitungKelilingPersegi()
    {
        int keliling = 4* this.sisi;
        return keliling;
    }
}
