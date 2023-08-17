package MyStack;

import Node.SingleLinkedNode;

public class MyStack<T> {
    private SingleLinkedNode<T> firstNode;
    private int size = 0;

    private SingleLinkedNode<T> getLastNode() {
        isEmpty();

        SingleLinkedNode<T> currentNode = firstNode;
        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode;
    }

    public void isEmpty() {
        if (firstNode == null) {
            throw new RuntimeException("There isn't any element in stack");
        }
    }

    public void add(T value) {
        if (firstNode == null) {
            firstNode = new SingleLinkedNode<>(null, value);
        } else {
            getLastNode().setNextNode(new SingleLinkedNode<>(null, value));
        }
        size++;
    }

    public void remove(int index) {
        if (index >= size() || index < 0)
            throw new RuntimeException("Specified index does not exist");

        int currentIndex = 0;
        SingleLinkedNode<T> currentNode = firstNode;

        while (currentIndex != index - 1) {
            currentNode = currentNode.getNextNode();
            currentIndex++;
        }

        SingleLinkedNode<T> nextAfterNodeToRemove = currentNode.getNextNode().getNextNode();
        currentNode.setNextNode(nextAfterNodeToRemove);
        size--;
    }

    public void clear() {
        firstNode = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        isEmpty();

        SingleLinkedNode<T> currentNode = firstNode;
        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode.getValue();
    }

    public T pop() {
        isEmpty();

        T firstStackElement = getLastNode().getValue();

        SingleLinkedNode<T> currentNode = firstNode;
        while (currentNode.getNextNode().getValue() != firstStackElement) {
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(null);
        size--;

        return firstStackElement;
    }

    @Override
    public String toString() {
        if (firstNode == null)
            return "[]";

        SingleLinkedNode<T> currentNode = firstNode;
        String queueStr = "[";

        while (currentNode.getNextNode() != null) {
            queueStr += currentNode.getValue() + ", ";
            currentNode = currentNode.getNextNode();
        }
        queueStr += currentNode.getValue() + "]";

        return queueStr;
    }
}
