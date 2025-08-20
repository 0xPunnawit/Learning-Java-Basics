package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListForInterview {

    public static void main(String[] args) {

        // Definition
        List<String> names = new ArrayList<>();
        List<Person> personList = new ArrayList<>();
        var Ing = new Person("Ing");

        // Add
        names.add("Punnawit");

        List<String> newUsers = List.of(
                "Toby",
                "Poppy",
                "Lily"
        );
        // Insertion man (all)
        names.addAll(newUsers);


        System.out.println(names);              // Output: [Punnawit, Toby, Poppy, Lily]
        System.out.println(personList);         // Output: [Person[name=Punnawit]]

        // Remove
        names.remove(1);
        System.out.println(names);              // Output: [Punnawit, Poppy, Lily]

        names.remove("Lily");
        System.out.println(names);              // Output: [Punnawit, Poppy]
        names.add(1, "Amily");
        System.out.println(names);              // Output: [Punnawit, Amily, Poppy]

        System.out.println(names.contains("Punnawit")); // Find Object -> Output: true

        names.clear();                          // Clear all
        System.out.println(names);              // Output: []


        personList.add(Ing);

        System.out.println(personList);         // Output: [Person[name=Ing]]
        personList.remove(Ing);
        System.out.println(personList);         // Output: []
        System.out.println();


        // Sorting => TC: O(n log n)
        var numberList = new ArrayList<>(List.of(45, 132, 87, 3, 5, 13, 11, 32, 55, 75));
        numberList.sort((e1, e2) -> Integer.compare(e1, e2));   // ASC
        System.out.println(numberList);

        numberList.sort(Collections.reverseOrder());   // DESC
        System.out.println(numberList);


        List<Stat> statList = new ArrayList<>(
                List.of(
                        new Stat(1,5),
                        new Stat(2,2),
                        new Stat(3, 13),
                        new Stat(4,8),
                        new Stat(5,7)
                )
        );
        // Before
        System.out.println("Before sort:" + statList);
        statList.sort((e1, e2) -> Integer.compare(e1.overall, e2.overall)); // ASC
        // After
        System.out.println("After sort:" + statList);

        // Steam API Example

        var list = statList.stream()
                .filter(s -> s.overall > 5) // Hire only player with overall > 5
                .map(s -> new Stat(s.playerId, s.overall * 4))
                .sorted((e1, e2) -> Integer.compare(e1.overall, e2.overall))    // DESC
                .limit(1)
                .toList();

        var iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

    }


    private record Person(String name) {}

    private record Stat(int playerId, int overall) {}

}
