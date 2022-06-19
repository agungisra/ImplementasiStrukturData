package Jurnal06.Searching;

public class ContohSequentialSearch {
    private int[] allData = new int[]{30, 4, 7, 10, 8, 100, 33};

    private void tampilkanData(){
        for (int data : allData) {
            System.out.print(data + " ");
        }
        System.out.println();
    }

    private void searching(int karakter){
        int x = 0;
        boolean ketemu = false;
        for (int i = x; i < allData.length; i++) {
            if(karakter.equals(allData[i])){
                ketemu = true;
                x = i;
            }
        }
        if(ketemu){
            System.out.println("Data berada pada urutan ke - "+(x+1));
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
    }

    public static void main(String[] args) {
        ContohSequentialSearch obj = new ContohSequentialSearch();

//        Untuk menampilkan data pada Array
        obj.tampilkanData();

//        Melakukan pencarian data
        obj.searching(4);
    }
}

