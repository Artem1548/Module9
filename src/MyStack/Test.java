package MyStack;

    public class Test {
        public static void main(String[] args) {
            testMyStack();
        }

        public static void testMyStack() {
            MyStack<Integer> stack = new MyStack<Integer>();
            System.out.println("Add elements");
            for (int i = 1; i <= 5; i++) {
                stack.add(i);
            }
            System.out.println("stack.size = " + stack.size());
            System.out.println("stack.peek() = " + stack.peek());
            System.out.println("stack.pop() = " + stack.pop());
            System.out.println("stack.size() = " + stack.size());
            stack.remove(2);
            System.out.println("stack.size() = " + stack.size());
            stack.clear();
            System.out.println("stack.size() = " + stack.size());
        }
    }