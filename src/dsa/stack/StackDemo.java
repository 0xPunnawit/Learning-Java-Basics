package dsa.stack;

import java.util.List;

public class StackDemo {

    public static void main(String[] args) {

        OwnStack ownStack = new OwnStack(5);
        var nums = List.of(1, 3, -5, 7, 9);
        System.out.println(nums);

        for (int num : nums) {
            ownStack.push(num);
        }
        System.out.println("\nบนสุดคือเลข: " + ownStack.peek() + "\n");
        var targetPop = 2;
        while (targetPop-- > 0) {
            System.out.println("เลขที่เอาออก: " + ownStack.pop());
        }
        System.out.println("\nบนสุดตอนนี้คือเลข: " + ownStack.peek());

    }

    private static class OwnStack {

        private final int maxSize;
        private final int[] stack;
        private int top;

        public OwnStack(int maxSize) {
            this.stack = new int[maxSize];
            this.top = -1;
            this.maxSize = maxSize;
        }

        // push
        public void push(int value) {
            if (top == maxSize - 1) {
                System.out.println("Stack is full");
                throw new RuntimeException("Stack is full");
            }
            this.stack[++top] = value;
        }

        // pop
        public int pop() {
            if (top == -1) {
                System.out.println("Stack is empty");
                throw new RuntimeException("Stack is empty");
            }
            return this.stack[top--];
        }

        // peek
        public int peek() {
            if (top == -1) {
                System.out.println("Stack is empty");
                throw new RuntimeException("Stack is empty");
            }
            return this.stack[top];
        }
    }
}
