public class Segitiga {
    int alas, tinggi;
    float setengah= 0.5f;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int hitungLuasSegitiga()
    {
        float luas = setengah* this.alas * this.tinggi;
        return (int) luas;
    }

    public int hitungKelilingSegitiga()
    {
        int keliling = this.alas * this.tinggi;
        return keliling;
    }
}
