package ch.fhnw.oop1.ub.stack.impl.array;

import ch.fhnw.oop1.ub.stack.Stack;
import ch.fhnw.oop1.ub.stack.test.AbstractStackTest;

public class ArrayStackTest extends AbstractStackTest {
  @Override
  public Stack newStack() {
    return new ArrayStack();
  }
}
