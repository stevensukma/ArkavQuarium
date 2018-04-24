class Node<T> {
  private T value;
  private Node<T> next;

  public Node(T value) {
    this.value = value;
    this.next = null;
  }

  public Node<T> getNext() {
    return next;
  }

  public T getValue() {
    return value;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }
}