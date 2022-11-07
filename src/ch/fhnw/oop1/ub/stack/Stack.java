package ch.fhnw.oop1.ub.stack;

public interface Stack {
  boolean isEmpty();
  int getSize();
  void clear();
  Object peek();
  Object pop();
  void push(Object elem);
  void pushAll(Object[] elems);
  boolean equals(Object x);
}