package Searching;

public class ContohBinarySearch {
    private final int [] data = {4, 7, 10, 8, 9, 30, 33, 100};

    private void tampilData(){
        for (int i : data) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public String pencarianBinary(int key) {
        int bawah = 0;
        int atas = data.length - 1;

        while (atas >= bawah) {
            int tengah = (bawah + atas) / 2;
            if (key < data[tengah]){
                atas = tengah - 1;
            } else if (key == data[tengah]){
                return "Nomor "+key+" Berada Pada Urutan Ke - "+(tengah+1);
            }else{
                bawah = tengah + 1;
            }
        }
        return "Data Tidak Ditemukan";
    }

    public static void main(String args []){
        ContohBinarySearch obj = new ContohBinarySearch();
        obj.tampilData();
        System.out.println(obj.pencarianBinary(33));
    }
}
