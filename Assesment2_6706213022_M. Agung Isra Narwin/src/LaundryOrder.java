public class LaundryOrder implements Comparable<LaundryOrder>{
    String namaPelanggan;
    String tipeCucian;
    int idCuci;
    int tglMasuk;
    int tglKeluar;
    int beratCuci;

    public LaundryOrder(int idCuci, String namaPelanggan, int tglMasuk, String tipeCucian, int beratCuci) {
        switch (tipeCucian){
            case "biasa" :
                tglKeluar = 3 + tglMasuk;
                break;
            case "express" :
                tglKeluar = 2 + tglMasuk;
                break;
            case "kilat" :
                tglKeluar = 1 + tglMasuk;
                break;
        }

        this.idCuci = idCuci;
        this.namaPelanggan = namaPelanggan;
        this.tipeCucian = tipeCucian;
        this.tglMasuk = tglMasuk;
        this.beratCuci = beratCuci;
        this.tglKeluar = tglKeluar;


    }

    @Override
    public int compareTo(LaundryOrder o) {
        return Integer.compare(tglKeluar, o.tglKeluar);
    }
}
