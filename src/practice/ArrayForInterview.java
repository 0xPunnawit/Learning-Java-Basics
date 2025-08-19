package practice;

import java.util.Arrays;

public class ArrayForInterview {

    public static void main(String[] args) {
        // T[] variableName = new T[N] // T: data type, N: static size
        // array of primitive -> value is default
        // array of reference type -> value initial by null
        int[] data  = new int[20];
        System.out.println(Arrays.toString(data));
        // Manipulate -> index
        int index = 0;
        data[index] = 5;
        System.out.println(Arrays.toString(data));

        String[] name = {"Ing", "Punnawit", "Rodsai"};
        System.out.println(name.length);
        System.out.println(name[1].length());

        int[] data2 = new int[10];
        Arrays.fill(data2, 1);
        System.out.println(Arrays.toString(data2));
        System.out.println();

        int[] numbers = new int[5];
        numbers[0] = 18;
        numbers[1] = 22;
        numbers[2] = 51;
        numbers[3] = 3;
        numbers[4] = 9;
        System.out.println("======= Before Sort ======");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("======= After Sort ======");
        System.out.println(Arrays.toString(numbers));


        var numberBoxType = Arrays.stream(numbers)
                .boxed()
                .toList()
                .toArray(new Integer[0]);
        System.out.println("======= After Sort ======");
        Arrays.sort(numberBoxType, (a, b) -> b.compareTo(a));
        System.out.println(Arrays.toString(numberBoxType));


    }

}
