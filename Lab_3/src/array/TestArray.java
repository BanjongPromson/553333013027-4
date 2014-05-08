package array;

public class TestArray {

	public static void main(String[] args) {
	ArrayListPQ arlq = new ArrayListPQ();
	arlq.enqueue(1);
	arlq.enqueue(22);
	arlq.enqueue(10);
	arlq.enqueue(12);
	arlq.enqueue(5);
	arlq.enqueue(7);
	System.out.println(arlq.dequeue());
	System.out.println(arlq);
	
	}


}
