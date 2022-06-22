import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList<Pegawai> linkedList = new SinglyLinkedList<>();
        Scanner input = new Scanner(System.in);

        int command = 0;
        while (command != 6)
        {
            System.out.println("====== MENU ======");
            System.out.println("1. Input Data di Awal");
            System.out.println("2. Input Data di Akhir");
            System.out.println("3. Hapus Data di Awal");
            System.out.println("4. Hapus Data di Akhir");
            System.out.println("5. Cetak List");
            System.out.println("6. Keluar");
            System.out.println("Pilih menu:");

            command = input.nextInt();
            input.nextLine();

            System.out.println();

            switch (command)
            {
                case 1, 2:
                    System.out.println(command);
                    insertData (linkedList, input, command);
                    break;
                case 3:
                    linkedList.removeFromFront();
                    System.out.println("Data awal berhasil dihapus !");
                    break;
                case 4:
                    linkedList.removeFromBack();
                    System.out.println("Data akhir berhasil dihapus !");
                    break;
                case 5:
                    System.out.println("Data pegawai : ");
                    linkedList.print();
                    break;
            }
        }
    }

    static void insertData (SinglyLinkedList<Pegawai> list, Scanner input, int command)
    {
        String nextInsert;
        String nip;
        String nama;
        String divisi;

        do
        {
            System.out.print("NIP : ");
            nip = input.nextLine();

            System.out.print("Nama Pegawai : ");
            nama = input.nextLine();

            System.out.print("Devisi : ");
            divisi = input.nextLine();

            if (command == 1)
            {
                list.insertAtFront(new Pegawai (nip, nama, divisi));
            }
            else if (command == 2)
            {
                list.insertAtBack(new Pegawai(nip, nama, divisi));
            }

            System.out.print("Lanjut Isi Data (Y/N) ?");
            nextInsert = input.nextLine();
        }
        while (nextInsert.equalsIgnoreCase("Y"));
    }
}