import java.util.PriorityQueue;

public class Procces {
    PriorityQueue<LaundryOrder> orders = new PriorityQueue<>();

    void terimaCucian(int idCuci, String namaPelanggan, int tglMasuk, String tipeCucian ,  int beratCuci) {
        orders.offer(new LaundryOrder(idCuci, namaPelanggan, tglMasuk, tipeCucian, beratCuci));
    }

    void cuciBersih() {
        System.out.println("Urutan cucian harus diselesaikan :");

        while (!orders.isEmpty()) {
            LaundryOrder laundryOrder = orders.poll();
            System.out.printf("idCuci = %s, namaPelanggan = %s \n", laundryOrder.idCuci, laundryOrder.namaPelanggan, laundryOrder.tglKeluar);
        }
    }

    public static void main(String[] args) {
        Procces daftarCuci = new Procces();
        daftarCuci.terimaCucian(1, "Intan", 3, "biasa", 5);
        daftarCuci.terimaCucian(2, "Dudi", 4, "express", 3);
        daftarCuci.terimaCucian(3, "Ruli", 4, "kilat", 1);
        daftarCuci.terimaCucian(4, "Susi", 5, "biasa", 2);
        daftarCuci.terimaCucian(5, "Ira", 6, "biasa", 5);
        daftarCuci.terimaCucian(6, "Mayang", 7, "kilat", 4);

        daftarCuci.cuciBersih();
    }
}
