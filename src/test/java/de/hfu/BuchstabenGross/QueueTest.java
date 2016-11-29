package de.hfu.BuchstabenGross;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {

	private Queue queue;
	
	@Before
	public void erzeugeQueue() 
	{ 
		queue = new Queue(3);	
	}
	
	@Test (expected=IllegalArgumentException.class, timeout=1000)
	public void QueueSizeTest()
	{
		new Queue(0);
	}
	
	@Test (expected=IllegalStateException.class, timeout=1000)
	public void QueueIstLeer()
	{
		queue.dequeue();
	}
	
	@Test
	public void enqueueDequeueTest() 
	{
		int param1 = 0, param2 = 1, param3 = 2;
		queue.enqueue(param1);
		queue.enqueue(param2);
		queue.enqueue(param3);
		
		assertEquals(param1, queue.dequeue());
		assertEquals(param2, queue.dequeue());
		assertEquals(param3, queue.dequeue());
	}
	
	@Test
	public void enqueueDequeueRingTest() 
	{
		int param1 = 0, param2 = 1, param3 = 2;
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(param1);
		queue.enqueue(param2);
		queue.enqueue(param3);
		
		assertEquals(10, queue.dequeue());
		assertEquals(20, queue.dequeue());
		assertEquals(param3, queue.dequeue());
	}

}
