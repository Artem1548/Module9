package MyQueue;

import Node.SingleLinkedNode;

public class MyQueue<T> {
    private SingleLinkedNode<T> firstNode;
    private int size = 0;

    private void isEmpty() {
        if (firstNode == null)
            throw new RuntimeException("There is no any node");
    }

    private SingleLinkedNode<T> getLastNode() {
        isEmpty();

        SingleLinkedNode<T> currentNode = firstNode;
        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode;
    }

    public void add(T value) {
        if (firstNode == null) {
            firstNode = new SingleLinkedNode<>(null, value);
        } else {
            getLastNode().setNextNode(new SingleLinkedNode<>(null, value));
        }
        size++;
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
        return firstNode.getValue();
    }

    public T poll() {
        isEmpty();
        T valueOfFirstElement = firstNode.getValue();
        firstNode = firstNode.getNextNode();
        size--;
        return valueOfFirstElement;
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
