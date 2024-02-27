package pertemuan4;

public class RekeningBisnis extends Rekening {
    public final double BUNGA_SETOR = 0.001;
    public RekeningBisnis(Nasabah nasabah) {
        //memanggil constructor class induk
        super(nasabah);
    }
    public RekeningBisnis(Nasabah nasabah, int saldoAwal) {
        super(nasabah, saldoAwal);
    }
    //method overriding: sudah ada di class induk
    public void penyetoran(int jumlah){
        if(jumlah > 0) {
            int totalSetoran = jumlah + bunga(jumlah);
            super.penyetoran(totalSetoran);
        }
    }
    private int bunga(int jumlah) {
        return (int) BUNGA_SETOR * jumlah;
    }
}
