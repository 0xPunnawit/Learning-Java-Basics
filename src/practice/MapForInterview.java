package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class MapForInterview {

    public static void main(String[] args) {

        // Student Table
        Map<Integer, Student> studentTable = new HashMap<>();

        var student1 = new Student(1, "John");
        studentTable.put(student1.id, student1);
        System.out.println(studentTable.get(1));        // TC: O(1)

        // Check if key exists
        if (studentTable.containsKey(2)) {
            System.out.println(studentTable.containsKey(2));
        }

        // PriorityQueue + HashMap -> Character Frequency
        // Find the most frequent of character on message
        String message = "0AfjSdJAGSHdaczxiJ%kda@shf1sh3of4g@hpOAGdu&$)*#_igQT&x./)_*";
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : message.toCharArray()) {
//            if (!freqMap.containsKey(c)) {
//                freqMap.put(c, 0);
//            }
            freqMap.putIfAbsent(c, 0);
            freqMap.put(c, freqMap.get(c) + 1);
        }
        System.out.println(freqMap);


        Set<Map.Entry<Character, Integer>> entries = freqMap.entrySet();
        // Max Heap
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (e1, e2) -> Integer.compare(e2.getValue(), e1.getValue())
        );
        pq.addAll(entries);

        while (!pq.isEmpty()) {
            var entry = pq.poll();
            System.out.println(entry);
        }

    }

    private record Student(int id, String name) {}
}


