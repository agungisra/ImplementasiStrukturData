import java.util.*;

public class QueueLL<E> {
    private Queue<E> queueList;


    public QueueLL() {
        queueList = new LinkedList<E>();
    }

    public void enqueue(E object) {
        queueList.add(object);
    }

    public E dequeue() throws NoSuchElementException {
        return queueList.remove();
    }

    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    public void printQueue() {
        Iterator<E> iterator = queueList.iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.print(value + " ");
        }
    }
}
