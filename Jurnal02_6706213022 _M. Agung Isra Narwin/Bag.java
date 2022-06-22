public class Bag implements Comparable<Bag> {
    String kodeBarang;
    String jenisBarang;
    String namaBarang;
    String stokBarang;

    public Bag(String kodeBarang, String jenisBarang, String namaBarang, String stokBarang) {
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
    public int compareTo(Bag o) {
        return this.getkodeBarang().compareTo(o.getkodeBarang());
    }
}
