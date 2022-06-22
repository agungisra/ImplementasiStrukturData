public class Pegawai {

    private String nip;
    private String nama;
    private String divisi;

    public Pegawai(String nip, String nama, String devisi) {
        this.nip = nip;
        this.nama = nama;
        this.divisi = devisi;
    }

    public String getNip() {
        return nip;
    }

    @Override
    public String toString() {
        return "Pegawai{" +
                "nip='" + nip + '\'' +
                ", nama='" + nama + '\'' +
                ", devisi='" + divisi + '\'' +
                '}';
    }
}
