import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Lagu> listLagu = new LinkedList<Lagu>();
        Scanner input = new Scanner(System.in);

        String judul;
        String penyanyi;
        String nextInsert;

        int command = 0;
        while (command != 5) {
            System.out.println("======= MENU =======");
            System.out.println("1. Input Lagu");
            System.out.println("2. Hapus Lagu List Terakhir");
            System.out.println("3. Hapus Lagu Tertentu");
            System.out.println("4. Mainkan Lagu");
            System.out.println("5. Keluar");

            System.out.println("");
            System.out.println("Pilih menu:");

            command = input.nextInt();
            input.nextLine();

            System.out.println();

            ListIterator<Lagu> iterator = listLagu.listIterator();

            switch (command) {
                case 1:
                    do {
                        System.out.print("Judul Lagu : ");

                        judul = input.nextLine();

                        System.out.print("Nama Penyanyi : ");

                        penyanyi = input.nextLine();

                        listLagu.addLast(new Lagu (judul, penyanyi));

                        System.out.print("Lanjut Isi Data Y/N ?");
                        nextInsert = input.nextLine();
                        System.out.println("");
                        System.out.println("Berhasil menambahkan lagu!!");
                    }
                    while (nextInsert.equalsIgnoreCase("Y"));
                        break;
                case 2:
                    System.out.println("Berhasil menghapus lagu di list terakhir!!");
                    listLagu.removeLast();
                    break;
                case 3:
                    System.out.print("Masukan judul : ");

                    String hapus = input.nextLine();

                    ListIterator<Lagu> iter = listLagu.listIterator();
                    while (iter.hasNext()) {
                        Lagu ob = iter.next();
                        if(ob.getjudulLagu().equals(hapus)) {
                            iter.remove();
                        }
                    }
                    System.out.println("Berhasil menghapus lagu " +hapus+ " !!" );

                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Putar lagu dari awal");

                    while (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    System.out.println("");
                    System.out.println("Putar lagu dari akhir");
                    while (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
            }
        }
    }
}