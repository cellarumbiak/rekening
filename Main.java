package pertemuan4;

public class Main {
    public static void main(String[] args) {
        // Membuat objek nasabah
        Nasabah nasabah1 = new Nasabah("John Doe", "1234567890", "Jl. Contoh No. 123");

        // Membuat objek rekening biasa
        Rekening rekening1 = new Rekening(nasabah1);
        rekening1.penyetoran(100000);
        System.out.println("Saldo rekening biasa: " + rekening1.getSaldo());

        // Membuat objek rekening bisnis
        RekeningBisnis rekeningBisnis1 = new RekeningBisnis(nasabah1, 50000);
        rekeningBisnis1.penyetoran(200000);
        System.out.println("Saldo rekening bisnis: " + rekeningBisnis1.getSaldo());

        // Membuat objek rekening keluarga
        RekeningKeluarga rekeningKeluarga1 = new RekeningKeluarga(nasabah1);
        rekeningKeluarga1.penyetoran(150000);
        System.out.println("Saldo rekening keluarga: " + rekeningKeluarga1.getSaldo());

        // Membuat objek rekening syariah
        RekeningSyariah rekeningSyariah1 = new RekeningSyariah(nasabah1);
        rekeningSyariah1.penyetoran(200000);
        System.out.println("Saldo rekening syariah: " + rekeningSyariah1.getSaldo());

        // Membuat objek rekening utama
        RekeningUtama rekeningUtama1 = new RekeningUtama(nasabah1, 5000000);
        rekeningUtama1.penyetoran(300000);
        System.out.println("Saldo rekening utama: " + rekeningUtama1.getSaldo());

        // Membuat objek rekening tambahan
        RekeningTambahan rekeningTambahan1 = new RekeningTambahan(nasabah1, 1000000);
        rekeningTambahan1.penyetoran(200000);
        System.out.println("Saldo rekening tambahan: " + rekeningTambahan1.getSaldo());
    }
}
