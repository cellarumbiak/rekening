package pertemuan4;

public class RekeningTambahan extends Rekening {
    private static final int BATAS_PENARIKAN = 500000;
    private static final int BIAYA_ADMINISTRASI = 5000;

    public RekeningTambahan(Nasabah nasabah) {
        super(nasabah);
    }

    public RekeningTambahan(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }


    public void penarikan(int jumlah) {
        if (jumlah > 0 && jumlah <= BATAS_PENARIKAN) {
            super.penarikan(jumlah + BIAYA_ADMINISTRASI);
        }
    }

    @Override
    public void penyetoran(int jumlah) {
        super.penyetoran(jumlah);
        int bunga = (int) (0.005 * jumlah);
        super.penyetoran(bunga);
    }
}

