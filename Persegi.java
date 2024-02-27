package pertemuan4;

public class Persegi extends BangunDatar{
    private double sisi;
    public Persegi(double sisi){

        this.sisi=sisi;
    }
    //mengoverride method yg ada di class abstract
    public double luas(){
        return sisi*sisi ;
    }
    public double keliling(){
        return 4*sisi;
    }
}
