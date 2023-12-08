public class PersegiPanjang {
    int panjang, lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int hitungLuasPersegiPanjang()
    {
        int luas = this.panjang * this.lebar;
        return luas;
    }

    public int hitungKelilingPersegiPanjang()
    {
        int keliling = 2*this.panjang + 2*this.lebar;
        return keliling;
    }
}
