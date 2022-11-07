package ch.fhnw.oop1.ub.stack.impl.linked;

import ch.fhnw.oop1.ub.stack.Stack;
import ch.fhnw.oop1.ub.stack.impl.AbstractStack;

public class LinkedStack extends AbstractStack implements Stack {

  private Node root;

  private Node getNodeAtPosition(int position, Node rootNode) {
    Node currentNode = rootNode;
    for (int i = 0; i < position; i++) {
      currentNode = currentNode.next;
    }
    return currentNode;
  }

  private Node getNodeAtPosition(int position) {
    return getNodeAtPosition(position, root);
  }

  @Override
  public Object peek() {
    return getNodeAtPosition(itemsCount - 1).element;
  }

  @Override
  public Object pop() {
    Object deletedElement = getNodeAtPosition(itemsCount - 1).element;
    getNodeAtPosition(itemsCount - 1).next = null;
    itemsCount--;
    return deletedElement;
  }

  @Override
  public void push(Object elem) {
    Node newNode = new Node(elem);
    if (root == null) {
      root = newNode;
    } else {
      getNodeAtPosition(itemsCount - 1).next = newNode;
    }
    itemsCount++;
  }

  @Override
  public boolean equals(Object x) {
    if (!(x instanceof LinkedStack)) {
      return false;
    }

    LinkedStack aStack = (LinkedStack) x;
    LinkedStack bStack = this;

    if (aStack.getSize() != bStack.getSize()) {
      return false;
    }

    for (int i = 0; i < bStack.getSize(); i++) {
      Object elemA = getNodeAtPosition(i, aStack.root).element;
      Object elemB = getNodeAtPosition(i).element;

      if (elemA == null && elemB == null) {
        continue;
      }

      if (!elemA.equals(elemB)) {
        return false;
      }
    }

    return true;
  }
}
