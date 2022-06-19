public class BTNode2 <E>{
    BTNode2 left, right;
    E data;
//    Constructor
    public BTNode2() {
        left = null;
        right = null;
        data = null;
    }
//    Constructor
    public BTNode2(E item) {
        left = null;
        right = null;
        data = item;
    }
//    Fungsi mengatur node kiri
    public void setLeft(BTNode2 n) {
        left = n;
    }
//    Fungsi mengatur node kanan
    public void setRight(BTNode2 n) {
        right = n;
    }
//    Fungsi mengambil node kiri
    public BTNode2 getLeft() {
        return left;
    }
//    Fungsi mengambil node kanan
    public BTNode2 getRight() {
        return right;
    }
//    Fungsi mengatur data ke node
    public void setData(E d) {
        data = d;
    }
//    Fungsi mendapatkan data dari node
    public E getData() {
        return data;
    }
}