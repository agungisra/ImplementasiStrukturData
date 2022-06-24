import java.util.HashMap;

public class Main {

    //membuat fungsi untuk mencari nilai rata-rata
    public static int mean(HashMap<Mahasiswa, Integer> mhs){
        int jumlahNilai = 0;
        for (Object o: mhs.keySet()){
            jumlahNilai += mhs.get(o);
        }
        return (jumlahNilai/ mhs.size());
    }

    //membuat fungsi untuk mencetak/menampilkan hasil
    public static void print(HashMap<Mahasiswa, Integer> mhs){
        for (Object o: mhs.keySet()){
            System.out.println("key: " + o + "nilai dari mahasiswa: " + mhs.get(o));
        }
    }
    public static void main(String[] args) {
        HashMap<Mahasiswa, Integer> mhs = new HashMap<Mahasiswa, Integer>();
        //menambahkan nama , nim, dan kelas mahasiswa
        Mahasiswa rudi = new Mahasiswa(670621004, "Rudi", "45-05");
        mhs.put(rudi, 70);
        Mahasiswa jimin = new Mahasiswa(670621004, "Jimin", "45-05");
        mhs.put(jimin, 80);
        Mahasiswa badrun = new Mahasiswa(670621004, "Badrun", "45-05");
        mhs.put(badrun, 60);
        Mahasiswa sai = new Mahasiswa(670621004, "Sai", "45-05");
        mhs.put(sai, 95);

        print(mhs);
        System.out.println();
        //mencetak rata-rata mahasiswa
        System.out.println("Rata-rata nilai mahasiswa di atas adalah " + mean(mhs));

        // menghapus mahasiswa yang bernama badrun
        mhs.remove(badrun);
        System.out.println();

        print(mhs);
        mean(mhs);
        System.out.println();

        //mencetak rata-rata mahasiswa setelah badrun di hapus dari daftar mahasiswa
        System.out.println("Rata-rata nilai mahasiswa di atas adalah " + mean(mhs));
    }
}