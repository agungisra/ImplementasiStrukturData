public class TreeNode <E extends Comparable<E>>{
    private TreeNode<E> leftNode;
    private TreeNode<E> rightNode;
    private E data;

    // Constructor
    public TreeNode(E nodeData) {
        data = nodeData;
        leftNode = rightNode = null;
    }
    // fungsi mendapatkan data
    public E getData() {
        return data;
    }
    // fungsi mendapatkan node kiri
    public TreeNode<E> getLeftNode() {
        return leftNode;
    }
    // fungsi mendapatkan node kanan
    public TreeNode<E> getRightNode() {
        return rightNode;
    }

    public void insert(E insertValue) {
        // membandingkan
        if (insertValue.compareTo(data) < 0) {
            if (leftNode == null) {
                leftNode = new TreeNode<E>(insertValue);
            } else {
                leftNode.insert(insertValue);
            }
        }

        else if (insertValue.compareTo(data) > 0) {

            if (rightNode == null) {
                rightNode = new TreeNode<E>(insertValue);
            } else {
                rightNode.insert(insertValue);
            }
        }
    }
}