public class Main {
    public static void main(String[] args) {
        Tree<Character> tree = new Tree<>();
        // Input data
        tree.insertNode('F');
        tree.insertNode('E');
        tree.insertNode('H');
        tree.insertNode('D');
        tree.insertNode('G');
        tree.insertNode('C');
        tree.insertNode('B');
        tree.insertNode('H');
        tree.insertNode('K');
        tree.insertNode('J');

        // Preorder traversal
        System.out.printf("%n%nPreorder traversal%n");
        tree.preorderTraversal();
        // Inorder traversal
        System.out.printf("%n%nInorder traversal%n");
        tree.inorderTraversal();
        // Postorder traversal
        System.out.printf("%n%nPostorder traversal%n");
        tree.postorderTraversal();
        System.out.println();

        System.out.println();

        // Mencari karakter
        tree.searchBST('K');
        tree.searchBST('A');
    }
}