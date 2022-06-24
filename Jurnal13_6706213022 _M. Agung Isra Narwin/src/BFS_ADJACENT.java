import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_ADJACENT {
    private Queue<NodeAdjacent> queue = new LinkedList<>(); //daftar Queue
    static ArrayList<NodeAdjacent> nodes = new ArrayList<NodeAdjacent>(); //daftar vertex


    public ArrayList<NodeAdjacent> listTetangga(int matriks[][], NodeAdjacent x) {
        int idx = -1;
        ArrayList<NodeAdjacent> tetangga = new ArrayList<>();
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).getData() == x.getData()) {
                idx = i;
                break;
            }
        }
        if (idx != -1) {
            for (int j = 0; j < matriks[idx].length; j++) {
                if (matriks[idx][j] == 1) {
                    tetangga.add(nodes.get(j));
                }
            }
        }
        return tetangga;
    }

    public void bfs(int matriks[][], NodeAdjacent node) {
        //menambahkan node ke dalam Queue
        queue.add(node);
        node.setVisited(true);
        //mengecek Queue apakah kosong
        while (!queue.isEmpty()) {
            //mengeluarkan elemen node antrian
            NodeAdjacent element = queue.remove();
            //mencetak elemen dengan memanggil method convertAlphabet
            System.out.print(convertAlphabet(element.getData()) + " ");
            ArrayList<NodeAdjacent> tetangga = listTetangga(matriks, element);
            for (int i = 0; i < tetangga.size(); i++) {
                NodeAdjacent n = tetangga.get(i);
                if (n != null && !n.isVisited()) {
                    queue.add(n);
                    n.setVisited(true);
                }
            }
        }
    }

    //membuat method untuk mengonversi angka ke huruf
    public String convertAlphabet(int i){
        i--;

        return "ABCDEFGHIJKLMNOPQRSTUVWCYZ".substring(i, i+1);
    }

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
        //Mencetak penelusuran
        System.out.print("Hasil Penelusuran BFS : ");
        BFS_ADJACENT bfs_adjacent = new BFS_ADJACENT();
        bfs_adjacent.bfs(matriks, node1);
        System.out.println("");
    }
}