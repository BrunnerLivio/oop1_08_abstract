package ch.fhnw.oop1.ub.stack.test;

import static org.junit.Assert.*;
import org.junit.Test;

/*
import ch.fhnw.oop1.ub.stack.Stack;

public abstract class AbstractStackTest {

	// Erzeugt eine neue Stack Instanz.
	public abstract Stack newStack();

	@Test
	public void testIsEmpty() {
		Stack zeroSize = newStack();
		assertTrue(zeroSize.isEmpty());
		
		Stack nonZeroSize = newStack();
		assertTrue(nonZeroSize.isEmpty());
		
		Stack s = newStack();
		s.push(1);
		assertFalse(s.isEmpty());
	}
	
	@Test
	public void testGetSize() {
		Stack zeroSize = newStack();
		assertEquals(0, zeroSize.getSize());
		
		Stack nonZeroSize = newStack();
		assertEquals(0, nonZeroSize.getSize());
		nonZeroSize.push(1);
		assertEquals(1, nonZeroSize.getSize());
		nonZeroSize.push(1);
		assertEquals(2, nonZeroSize.getSize());
	}
	
	@Test
	public void testPushPopPeek() {
		Stack s = newStack(); 
		s.push(1);
		assertEquals(1, s.peek());
		assertEquals(1, s.pop());
		
		assertTrue(s.isEmpty());
		
		s.push(1);
		s.push(2);
		assertEquals(2, s.peek());
		assertEquals(2, s.pop());
		assertEquals(1, s.peek());
		assertEquals(1, s.pop());
	}
	
	@Test
	public void testEquality() {
		Stack s0 = newStack(); 
		s0.push(1);
		s0.push(2);
		s0.push(3);
		
		Stack s1 = newStack(); 
		assertFalse(s0.equals(s1));
		
		s1.push(1);
		s1.push(2);
		s1.push(3);
		assertTrue(s0.equals(s1));
		

		Stack s2 = newStack(); 
		
		s2.push(1);
		s2.push(2);
		s2.push(3);
		assertTrue(s0.equals(s2));
	}
	
	@Test
	public void testEqualityCrap() {
		Stack s0 = newStack(); 
		s0.push(1);
		s0.push(2);
		s0.push(3);
		
		assertFalse(s0.equals(null));
		assertFalse(s0.equals(new Object()));
	}
	
	@Test
	public void testEqualityWrongOrder() {
		Stack s0 = newStack(); 
		s0.push(1);
		s0.push(2);
		s0.push(3);
		
		Stack s1 = newStack(); 
		
		s1.push(3);
		s1.push(2);
		s1.push(1);
		assertFalse(s0.equals(s1));
	}
	
	@Test
	public void testEqualityNullValues() {
		Stack s0 = newStack(); 
		s0.push(1);
		s0.push(null);
		s0.push(3);
		
		Stack s1 = newStack(); 
		
		s1.push(1);
		s1.push(null);
		s1.push(3);
		assertTrue(s0.equals(s1));
	}
}
*/
