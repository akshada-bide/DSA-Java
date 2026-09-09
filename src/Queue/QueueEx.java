package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(2);
        queue.add(6);
        queue.add(4);

        System.out.println(queue.peek()); //just get the item from the stack, not removing it
        System.out.println(queue.remove()); //remove element from queue
    }
}
