public class NodeAdjacent {
    private int data;
    private boolean visited=false;

    NodeAdjacent(int data) {
        this.data = data;
    }

    //fungsi mengambil data
    public int getData() {
        return data;
    }

    //fungsi apakah node sudah dikunjungi
    public boolean isVisited() {
        return visited;
    }

    //menandai node telah dikunjungi
    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}