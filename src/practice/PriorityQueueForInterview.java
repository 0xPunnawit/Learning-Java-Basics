package practice;

import java.lang.reflect.Member;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueForInterview {

    // PriorityQueue -> Queue with condition

    // Example -> Member Rank : Bronze, Silver, Gold, Platinum
    // -> Bronze -> 1, Silver -> 2, Gold -> 3, Platinum -> 4

    //    Offer (Insert from tail)              (Enqueue)
    //    Poll (Remove front element)           (Dequeue)
    //    Peek (see front element)


    public static void main(String[] args) {
        System.out.print("===================== MAX HEAP =====================\n");

        PriorityQueue<Member> maxHeap = new PriorityQueue<>(
                (e1, e2) -> Integer.compare(e2.type.getRanking(), e1.type.getRanking())
        );
        maxHeap.offer(new Member("Toby", Type.SILVER));
        maxHeap.offer(new Member("Lucy", Type.BRONZE));
        maxHeap.offer(new Member("Amily", Type.GOLD));
        maxHeap.offer(new Member("Poppy", Type.SILVER));


        while (!maxHeap.isEmpty()) {
            var current = maxHeap.poll();
            System.out.println(current);
        }

        System.out.println();

        System.out.print("===================== MIN HEAP =====================\n");
        PriorityQueue<Member> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(e -> e.type.getRanking())
        );
        minHeap.offer(new Member("Toby", Type.SILVER));
        minHeap.offer(new Member("Lucy", Type.BRONZE));
        minHeap.offer(new Member("Amily", Type.GOLD));
        minHeap.offer(new Member("Poppy", Type.SILVER));


        while (!minHeap.isEmpty()) {
            var current = minHeap.poll();
            System.out.println(current);
        }

    }

    private record Member(String name, Type type){}

    private enum Type {
        BRONZE(1),
        SILVER(2),
        GOLD(3),
        PLATINUM(4);

        private int ranking;

        Type(int ranking) {
            this.ranking = ranking;
        }

        public int getRanking() {
            return this.ranking;
        }

    }

}
