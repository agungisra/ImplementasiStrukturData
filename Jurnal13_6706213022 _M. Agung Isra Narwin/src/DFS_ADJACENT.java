import java.util.ArrayList;
import java.util.Stack;

public class DFS_ADJACENT {
    static ArrayList<NodeAdjacent> nodes = new ArrayList<>();

    public ArrayList<NodeAdjacent> findNeighbours(int matriks[][], NodeAdjacent x) {

        int idx = -1;
        ArrayList<NodeAdjacent> tetangga = new ArrayList<>();
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).equals(x)) {
                idx = i;
                break;
            }
        }

        if (idx != -1) {//memasukkan node tetangga
            for (int j = 0; j < matriks[idx].length; j++) {
                if (matriks[idx][j] == 1) {
                    tetangga.add(nodes.get(j));
                }
            }
        }
        return tetangga;
    }


    public void dfsUsingStack(int matriks[][], NodeAdjacent node) {
        //membuat stack
        Stack<NodeAdjacent> stack = new Stack<>();
        //menambahkan node ke dalam stack
        stack.add(node);
        while (!stack.isEmpty()) { //mengecek apakah stack kosong atau tidak
            NodeAdjacent element = stack.pop();
            //jika element stack sudah terkunjungi
            if (!element.isVisited()) {
                //mencetak element dengan memanggil method convertAlphabet karena di soal nodenya huruf
                System.out.print(convertAlphabet(element.getData()) + " ");
                element.setVisited(true);
            }
            ArrayList<NodeAdjacent> tetangga = findNeighbours(matriks, element);
            for (int i = 0; i < tetangga.size(); i++) {//mencari node tetangga dari node yang dikunjungi
                NodeAdjacent n = tetangga.get(i);
                if (n != null && !n.isVisited()) {
                    stack.add(n);
                }
            }
        }
    }
    public String convertAlphabet(int i){ //membuat method untuk mengonversi angka ke huruf
        i--;

        return "ABCDEFGHIJKLMNOPQRSTUVWCYZ".substring(i, i+1);
    }
/*
Method utama, berisi penentuan matriks dan pemanggilan algoritma.
Daftar simpul, dengan asumsi value unik
*/

    public static void main(String arg[]) {
        //memasukkan node sesuai di soal
        NodeAdjacent node1 = new NodeAdjacent(1);
        NodeAdjacent node2 = new NodeAdjacent(2);
        NodeAdjacent node3 = new NodeAdjacent(3);
        NodeAdjacent node4 = new NodeAdjacent(4);
        NodeAdjacent node5 = new NodeAdjacent(5);
        NodeAdjacent node6 = new NodeAdjacent(6);
        NodeAdjacent node7 = new NodeAdjacent(7);
        NodeAdjacent node8 = new NodeAdjacent(8);
        NodeAdjacent node9 = new NodeAdjacent(9);

        //menambahkan node ke dalam iterator
        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        nodes.add(node4);
        nodes.add(node5);
        nodes.add(node6);
        nodes.add(node7);
        nodes.add(node8);
        nodes.add(node9);

        int matriks[][] = {

                {0, 1, 0, 1, 1, 0, 0, 0, 0}, // Simpul A : value A
                {0, 0, 0, 0, 1, 0, 0, 0, 0}, // Simpul B : value B
                {0, 1, 0, 0, 0, 0, 0, 0, 0}, // Simpul C : value C
                {0, 0, 0, 0, 0, 0, 1, 0, 0}, // Simpul D : value D
                {0, 0, 0, 0, 0, 1, 0, 1, 0}, // Simpul E : value E
                {0, 0, 1, 0, 0, 0, 0, 1, 0}, // Simpul F : value F
                {0, 0, 0, 0, 0, 0, 0, 1, 0}, // Simpul G : value G
                {0, 0, 0, 0, 0, 0, 0, 0, 1}, // Simpul H : value H
                {0, 0, 0, 0, 0, 1, 0, 0, 0}, // Simpul I : value I
        };
        //mencetak penelurusan
        DFS_ADJACENT dfsExample = new DFS_ADJACENT();
        System.out.print("Hasil Penelusuran DFS : ");
        dfsExample.dfsUsingStack(matriks, node1);
        System.out.println();
    }
}