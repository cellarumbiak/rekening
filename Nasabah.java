package pertemuan4;

public class Nasabah {
    private String identitas;
    private String nama;
    private String alamat;

    public Nasabah(String identitas, String nama, String alamat) {
        this.identitas=identitas;
        this.nama=nama;
        this.alamat=alamat;
    }

    public String getIdentitas() {
        return identitas;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}
