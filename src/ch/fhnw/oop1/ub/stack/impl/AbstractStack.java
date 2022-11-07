package ch.fhnw.oop1.ub.stack.impl;

public abstract class AbstractStack {
  protected int itemsCount = 0;

  public boolean isEmpty() {
    return getSize() == 0;
  }

  public int getSize() {
    return itemsCount;
  }

  public void clear() {
    for (int i = 0; i < getSize(); i++) {
      pop();
    }
  }

  public void pushAll(Object[] elems) {
    for (Object elem : elems) {
      push(elem);
    }
  }

  public abstract void push(Object elem);

  public abstract Object pop();

}
