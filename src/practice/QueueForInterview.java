package practice;

import java.util.LinkedList;
import java.util.Queue;

public class QueueForInterview {

    /*
        Queue - First In First Out (FIFO)

        Offer (Insert from tail)              (Enqueue)
        Poll (Remove front element)           (Dequeue)
        Peek (see front element)

    */


    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.offer(new Person("Toby"));
        queue.offer(new Person("Lucy"));
        queue.offer(new Person("Amily"));
        queue.offer(new Person("Poppy"));

        // Output: [Person[name=Toby], Person[name=Lucy], Person[name=Amily], Person[name=Poppy]]
        System.out.println(queue);
        System.out.println(queue.peek());

        var frontOfQueue = queue.poll();        // Remove Queue
        System.out.println(frontOfQueue);

        System.out.println(queue);              // Output: [Person[name=Lucy], Person[name=Amily], Person[name=Poppy]]
        System.out.println();

        while (!queue.isEmpty()) {
            var person = queue.poll();
            System.out.println(person);
        }

    }

    private record Person(String name){}

}
