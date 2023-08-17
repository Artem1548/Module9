package Node;

public class SingleLinkedNode<T> {
    private SingleLinkedNode<T> nextNode;
    private T value;

    public SingleLinkedNode(SingleLinkedNode<T> nextNode, T value) {
        this.nextNode = nextNode;
        this.value = value;
    }

    public SingleLinkedNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(SingleLinkedNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
