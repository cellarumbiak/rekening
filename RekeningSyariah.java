package pertemuan4;

public class RekeningSyariah extends Rekening {
    private static final int BIAYA_ADMINISTRASI = 1000;
    private static final int BATAS_PENARIKAN_TANPA_BIAYA = 100000;

    public RekeningSyariah(Nasabah nasabah) {
        super(nasabah);
    }

    public RekeningSyariah(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }


    public void penarikan(int jumlah) {
        if (jumlah > BATAS_PENARIKAN_TANPA_BIAYA) {
            jumlah += BIAYA_ADMINISTRASI;
        }
        super.penarikan(jumlah);
    }

    public void sedekah(int jumlahSumbangan) {
        if (jumlahSumbangan > 0 && getSaldo() >= jumlahSumbangan) {
            super.penarikan(jumlahSumbangan);
        }
    }
}
