import java.util.LinkedList;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList<String> staff = new LinkedList<String>();
        staff.addLast("Diana");
        staff.addLast("Harry");
        staff.addLast("Romeo");
        staff.addLast("Tom");

        ListIterator<String> iterator = staff.listIterator();
        iterator.next();
        iterator.next();

        iterator.add("Juliet");
        iterator.add("Nina");
        iterator.next();
        iterator.remove();

        for (String name : staff)
            System.out.print(name + " ");
        System.out.println();
        System.out.println("Expected: Diana Harry Juliet Nina Tom");
    }

}
