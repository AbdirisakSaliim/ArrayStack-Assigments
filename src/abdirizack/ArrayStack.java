public class ArrayStack {

    private int[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    private void expandCapacity() {
        int[] newStack = new int[stack.length * 2];

        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
    }

    public void push(int value) {
        if (top == stack.length - 1) {
            expandCapacity();
        }

        top++;
        stack[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        int value = stack[top];
        top--;

        return value;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static int[] reverseArray(int[] numbers) {

        ArrayStack stack = new ArrayStack(2);

        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }

        int[] reversed = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = stack.pop();
        }

        return reversed;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int[] result = reverseArray(numbers);

        System.out.print("Reversed Array: ");

        for (int num : result) {
            System.out.print(num + " ");

        }
    }
    {
        System.out.println("Name: Abdirisak Yusuf Adam " +
                "ID: C6240069");
    }
}

