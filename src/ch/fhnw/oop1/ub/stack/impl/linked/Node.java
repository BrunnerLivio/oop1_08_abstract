package ch.fhnw.oop1.ub.stack.impl.linked;

class Node {
  public Node(Object element) {
    this.element = element;
  }

  public Node(Object element, Node next) {
    this(element);
    this.next = next;
  }

  Object element;
  Node next;
}
