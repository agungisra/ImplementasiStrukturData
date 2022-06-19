import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Membuat sebuah objek binary tree dengan singkatan bt
        BinaryTree2 bt = new BinaryTree2();

        System.out.println("Binary Tree Test");
        char ch;
        do {
            // Menampilkan Menu
            System.out.println("\nBinary Tree Operations\n");
            // Menu memasukkan data
            System.out.println("1. Insert ");
            // Menu mencari sebuah data
            System.out.println("2. Search");
            // Menu menghitung jumlah node
            System.out.println("3. Count Nodes");
            // Menu untuk mengecek tree kosong atau tidak
            System.out.println("4. Check Empty");
            // Pilih menu menggunakan angka
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice)
            {
                case 1 :
                    // Memanggil fungsi insert
                    System.out.println("Enter integer element to insert");
                    bt.insert( scan.nextInt() );
                    break;
                case 2 :
                    // Memanggil fungsi search
                    System.out.println("Enter integer element to search");
                    System.out.println("Search result : "+ bt.search(
                            scan.nextInt() ));
                    break;
                case 3 :
                    // Memanggil fungsi countNodes
                    System.out.println("Nodes = "+ bt.countNodes());
                    break;
                case 4 :
                    // Memanggil fungsi isEmpty
                    System.out.println("Empty status = "+ bt.isEmpty());
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            // Mencetak/Menampilkan Tree
            // Postorder
            System.out.print("\nPost order : ");
            bt.postorder();
            // Preorder
            System.out.print("\nPre order : ");
            bt.preorder();
            // inorder
            System.out.print("\nIn order : ");
            bt.inorder();
            System.out.println("\n\nDo you want to continue (Type y or n)\n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}