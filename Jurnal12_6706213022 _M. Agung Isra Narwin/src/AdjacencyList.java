import java.util.LinkedList;

public class AdjacencyList {
    int V;
    LinkedList<Character> adjListArray[];

    // Constructor
    AdjacencyList(int V) {
        this.V = V;

        // menentukan ukuran array
        adjListArray = new LinkedList[V];

        // membuat list baru pada setiap vertex
        for (int i = 0; i < V; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }
    // menambahkan edge
    public void addEdge(char from, char to) {
        int intsrc = (int)from - 65;
        adjListArray[intsrc].add(to);
    }

    // mencetak hasil
    public void printGraph() {
        for (int i = 0; i < V; i++) {
            if (adjListArray[i].size() > 0) {
                char vertex = (char)(i + 65);
                System.out.print("Vertex " + vertex + " is connected to: ");
                // looping untuk vertex yang dicari
                for (int j = 0; j < adjListArray[i].size(); j++) {
                    System.out.print(adjListArray[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}