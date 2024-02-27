package pertemuan4;

public class RekeningKeluarga extends Rekening {
    private static final int BIAYA_TARIK_TUNAI = 7000;
    private static final int BIAYA_TRANSFER = 5000;

    public RekeningKeluarga(Nasabah nasabah) {
        super(nasabah);
    }

    public RekeningKeluarga(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    public void tarikTunai(int jumlah) {
        if (jumlah > 0) {
            int totalPenarikan = jumlah + BIAYA_TARIK_TUNAI;
            super.penarikan(totalPenarikan);
        }
    }

    public void transfer(Rekening tujuan, int jumlah) {
        if (jumlah > 0 && getSaldo() >= jumlah + BIAYA_TRANSFER) {
            super.penarikan(jumlah + BIAYA_TRANSFER);
            tujuan.penyetoran(jumlah);
        }
    }
}
