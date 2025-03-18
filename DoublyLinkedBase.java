class DoublyLinkedBase<T> {
    private static class Node<T> {
        T element;
        Node<T> prev;
        Node<T> next;
        
        Node(T element, Node<T> prev, Node<T> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node<T> header;
    private Node<T> trailer;
    private int size = 0;

    public DoublyLinkedBase() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.next = trailer;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addBetween(T element, Node<T> predecessor, Node<T> successor) {
        Node<T> newNode = new Node<>(element, predecessor, successor);
        predecessor.next = newNode;
        successor.prev = newNode;
        size++;
    }

    public void addFirst(T element) {
        addBetween(element, header, header.next);
    }

    public void addLast(T element) {
        addBetween(element, trailer.prev, trailer);
    }

    public T remove(Node<T> node) {
        Node<T> predecessor = node.prev;
        Node<T> successor = node.next;
        predecessor.next = successor;
        successor.prev = predecessor;
        size--;
        return node.element;
    }

    public T removeFirst() {
        if (isEmpty()) return null;
        return remove(header.next);
    }

    public T removeLast() {
        if (isEmpty()) return null;
        return remove(trailer.prev);
    }

    public void printList() {
        Node<T> current = header.next;
        while (current != trailer) {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }
}
