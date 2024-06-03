import behaviour.snacknladder.Player;

import java.util.*;
import java.util.concurrent.*;

/**
 *
 * Iterable -> Collection -> Queue -> DeQueue ->
 * For Add :
 * add : Add the element from bottom, return true if added success otherwise
 * in case of violating capacity restriction throw IllegalStateException
 *
 * offer : Add the element into queue, return true if added success otherwise
 * in case of violating capacity restriction return false.
 *
 * For Retrieve:
 * element : retrieve from head, If Queue is empty throw NoSuchElementException
 * peek : retrieve from head, If Queue is empty return the null value
 *
 * For Removing:
 * remove -> remove from head and return the element, If Queue is empty throw NoSuchElementException
 * poll -> remove from head and return the element, If Queue is empty return the null value
 *
 *
 * element
 * offer
 * peek
 * poll
 */
public class Main {
    public static void main(String[] args) {

        Queue<Integer> integers=new LinkedBlockingQueue<>();
        Queue<Integer> integers2=new LinkedList<>();
        Queue<Integer> integers4=new PriorityQueue<>();
        Queue<Integer> integers5=new ConcurrentLinkedQueue<>();

        BlockingQueue<Integer> integers6=new ArrayBlockingQueue<>(2);
        BlockingQueue<Integer> integers7=new LinkedBlockingQueue<>(2);
        BlockingQueue<Integer> integers8=new PriorityBlockingQueue<>();
        BlockingQueue<Integer> integers9=new SynchronousQueue<>();

        Deque<String>  strings=new LinkedList<>();
        Deque<String>  string2=new ArrayDeque<>();

        integers.offer(2);
        integers.offer(3);
        boolean offer = integers.add(7);
        System.out.println(offer);


        System.out.println(integers);

        System.out.println(2+(3-2)/2);



    }
    private static int getNextPlayer(Queue<Integer> i) {
        int j = i.remove();
        i.add(j);
        return j;
    }
}