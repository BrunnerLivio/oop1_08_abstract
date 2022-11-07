package ch.fhnw.oop1.ub.stack.impl.array;

import ch.fhnw.oop1.ub.stack.Stack;
import ch.fhnw.oop1.ub.stack.impl.AbstractStack;

public class ArrayStack extends AbstractStack implements Stack {
  private Object[] items = new Object[0];

  @Override
  public Object peek() {
    return items[itemsCount - 1];
  }

  @Override
  public Object pop() {
    Object deletedItem = peek();
    Object[] oldElements = items;
    items = new Object[itemsCount - 1];

    for (int i = 0; i < oldElements.length - 1; i++) {
      items[i] = oldElements[i];
    }

    itemsCount--;

    return deletedItem;
  }

  @Override
  public void push(Object elem) {
    Object[] oldElements = items;
    items = new Object[itemsCount + 1];

    for (int i = 0; i < oldElements.length; i++) {
      items[i] = oldElements[i];
    }

    items[itemsCount] = elem;
    itemsCount++;
  }

  @Override
  public boolean equals(Object x) {
    if (!(x instanceof ArrayStack)) {
      return false;
    }

    ArrayStack aStack = this;
    // With TypeScript I wouldn't need to cast this.
    // amountOfTimesJavaIsAnnoying++; :)
    ArrayStack bStack = (ArrayStack) x;

    if (bStack.getSize() != aStack.getSize()) {
      return false;
    }

    for (int i = 0; i < aStack.getSize(); i++) {
      Object elemA = aStack.items[i];
      Object elemB = bStack.items[i];

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
