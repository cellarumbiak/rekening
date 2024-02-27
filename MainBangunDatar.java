package pertemuan4;

public class MainBangunDatar {
    public static void main(String[] args) {
        // Membuat objek persegi
        Persegi persegi = new Persegi(5);
        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("Keliling persegi: " + persegi.keliling());

        // Membuat objek lingkaran
        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("Luas lingkaran: " + lingkaran.luas());
        System.out.println("Keliling lingkaran: " + lingkaran.keliling());

        // Membuat objek segitiga
        Segitiga segitiga = new Segitiga(4, 5, 3, 4, 5);
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("Keliling segitiga: " + segitiga.keliling());

        // Membuat objek persegi panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(6, 8);
        System.out.println("Luas persegi panjang: " + persegiPanjang.luas());
        System.out.println("Keliling persegi panjang: " + persegiPanjang.keliling());
    }
}

