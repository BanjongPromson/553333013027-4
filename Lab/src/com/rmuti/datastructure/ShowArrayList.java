package com.rmuti.datastructure;

public class ShowArrayList {
	public static void main(String[] args) {

		ArrayList lst = new ArrayList();
		lst.add("Y");
		lst.add("O");
		lst.add("O"); 
		lst.add("0");
		lst.add("2");
		lst.add("7");
		System.out.println(lst);
		System.out.println("\n");
		
		ArrayListStack stk = new ArrayListStack();
		stk.push('A');
		stk.push('B');
		stk.push('C');
		stk.push('D');
		stk.push('E');
		stk.Show_Stack();
		System.out.println("pop = " + stk.pop());
		stk.Show_Stack();
		System.out.println("\n");

		ArrayListQueue q = new ArrayListQueue();
		q.enQueue("A");
		q.enQueue("B");
		q.enQueue("C");
		q.enQueue("D");
		q.enQueue("F");
		q.enQueue("G");
		q.Show_Queue();
		System.out.println("De Queue = " + q.deQueue());
		q.Show_Queue();
		System.out.println("De Queue = " + q.deQueue());
		q.Show_Queue();
		System.out.println("De Queue = " + q.deQueue());
		q.Show_Queue();
		System.out.println("First Data = " + q.peek());
		System.out.println("Data in Queue = " + q.getSize());
	}
}