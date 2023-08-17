package MyQueue;

public class Test {
    public static void main(String[] args) {
        testMyQueue();
    }

    public static void testMyQueue() {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        System.out.println("Add elements");
        for (int i = 1; i <= 5; i++) {
            queue.add(i);
        }
        System.out.println("queue.size = " + queue.size());
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.size() = " + queue.size());
        queue.clear();
        System.out.println("queue.size() = " + queue.size());
    }
}

