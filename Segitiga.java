package pertemuan4;

public class Segitiga extends BangunDatar{
    private double tinggi;
    private double alas;
    private double sisi1;
    private double sisi2;
    private double sisi3;
    public Segitiga(double tinggi, double alas, double sisi1,  double sisi2, double sisi3) {
        this.tinggi=tinggi;
        this.alas=alas;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public double luas() {
        return 0.5 * alas * tinggi;
    }

    public double keliling() {
        return sisi1 + sisi2 + sisi3;
    }
}
