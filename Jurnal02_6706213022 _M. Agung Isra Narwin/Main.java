import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GenArrayList<ATK> atkList = new GenArrayList<>(5);
        GenArrayList<Bag> bagList = new GenArrayList<>(5);
        
        for(int i=0; i<5; i++){
            String kodeBarang = input.next();
            String jenisBarang = input.next();
            String namaBarang = input.next();
            String stokBarang = input.next();
            bagList.addData(new Bag(kodeBarang, jenisBarang, namaBarang, stokBarang));
        }

        bagList.displaySort();

        for(int i=0; i<5; i++){
            String kodeBarang = input.next();
            String jenisBarang = input.next();
            String namaBarang = input.next();
            String stokBarang = input.next();
            ATK mhs = new ATK(kodeBarang, jenisBarang, namaBarang, stokBarang);

            atkList.addData(mhs);
        }
        atkList.addData(new ATK("A001", "Spidol", "l Snowman Board Marker warna hitam" , "4"));
        ATK mhDelete = (new ATK("A001", "Spidol", "l Snowman Board Marker warna hitam" , "4"));
        
        
        atkList.displaySort();

        atkList.removeData(mhDelete);
        atkList.display();
 }
}
