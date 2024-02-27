package pertemuan4;

public class Lingkaran extends BangunDatar{
    private double jarijari;

    public Lingkaran (double jarijari){
        this.jarijari=jarijari;

    }
    @Override
    public double luas() {
        return Math.PI * jarijari * jarijari;
    }

    @Override
    public double keliling() {
        return Math.PI * jarijari*2;
    }
}