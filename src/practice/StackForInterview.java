package practice;

import java.awt.print.Book;
import java.util.ArrayDeque;
import java.util.Deque;

public class StackForInterview {

    /*  STACK -> Last In First Out (LIFO)
        Push (Insert) TC: O(1)
        Pop (Remote top element) TC: O(1)
        Peek (See top element) TC: O(1)

        [BOOK5]
        [BOOK4]
        [BOOK3]
        [BOOK2]
        [BOOK1]
     */

    public static void main(String[] args) {
        Deque<Book> stack = new ArrayDeque<>();
        var book1 = new Book("BOOK1");
        var book2 = new Book("BOOK2");
        var book3 = new Book("BOOK3");
        var book4 = new Book("BOOK4");
        var book5 = new Book("BOOK5");
        stack.push(book1);
        stack.push(book2);
        stack.push(book3);
        stack.push(book4);
        stack.push(book5);
        System.out.println(stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());    // Output: BOOK4, BOOK3, BOOK2, BOOK1
        }
        System.out.println("Stack is empty: " + stack.isEmpty());
    }

    private record Book(String title) {

    }


}

