public class ATK implements Comparable<ATK> {
    String kodeBarang;
    String jenisBarang;
    String namaBarang;
    String stokBarang;

    public ATK(String kodeBarang, String jenisBarang, String namaBarang, String stokBarang) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
    }

    public String getkodeBarang() {
        return kodeBarang;
    }
    
    public String getjenisBarang() {
        return jenisBarang;
    }

    @Override
    public String toString() {
        return kodeBarang + " " + jenisBarang + " " + namaBarang + " " + stokBarang;
    }

    @Override
    public int compareTo(ATK o) {
        return this.getkodeBarang().compareTo(o.getkodeBarang());
    }
}
