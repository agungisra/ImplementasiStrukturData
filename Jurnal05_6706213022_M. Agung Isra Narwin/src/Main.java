import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QueueLL<String> queueSatu = new QueueLL<>();
        QueueLL<String> queueDua = new QueueLL<>();

        int command = 0;
        while (command != 5) {
            System.out.println("======= MENU =======");
            System.out.println("1. Tambah Pekerjaan");
            System.out.println("2. Tampilkan Pekerjaan");
            System.out.println("3. Hapus Pekerjaan");
            System.out.println("4. Tampilkan Semua");
            System.out.println("5. Keluar");

            System.out.println("");
            System.out.println("Pilih menu:");

            command = input.nextInt();
            input.nextLine();

            System.out.println();

            switch (command) {
                case 1:
                    System.out.print("Masukan Nama Pekerjaan : ");
                    String namaPekerjaan = input.next();
                    queueSatu.enqueue(namaPekerjaan);
                    queueDua.enqueue(namaPekerjaan);
                    System.out.println("");
                    break;
                case 2:
                    queueSatu.printQueue();
                    System.out.println("");
                    break;
                case 3:
                    queueSatu.dequeue();
                    System.out.println("Berhasil Dihapus");
                    System.out.println("");
                    break;
                case 4:
                    queueDua.printQueue();
                    System.out.println("");
                    break;
            }
        }
    }
}