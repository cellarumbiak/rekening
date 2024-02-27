package pertemuan4;

public class RekeningUtama extends Rekening {
    private static final int BATAS_PENARIKAN = 3000000;
    private static final int BIAYA_ADMINISTRASI = 5000;

    public RekeningUtama(Nasabah nasabah) {
        super(nasabah);
    }

    public RekeningUtama(Nasabah nasabah, int saldo) {
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

