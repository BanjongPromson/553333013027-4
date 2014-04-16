package arraylist;

public class ArrayList {
	
	private Object elementData[] = new Object[1];
	private int size = 0;

	private void ensureCapacity(int capacity) {
			if(capacity > elementData.length){
				Object arr[] = new Object[elementData.length*2];
				for (int i = 0; i < size; i++) {
					arr[i] = elementData[i];
				}
				elementData = arr;
			}
	}

	public void add(Object e) {
		add(size,e);
	}

	public void add(int i,Object e) {
		ensureCapacity(size+1);
		for (int j = size-1; j >= i; j--) {
				elementData[j+1] = elementData[j];
		}
		elementData[i] = e;
		size++;
	}
	public String toString() { 
		 String ret = "["; 
		 for (int i = 0; i < size; i++) { 						 
				 ret = ret + elementData[i] + ","; 						 
		 }			 
		 StringBuffer str = new StringBuffer(ret);
		 str.setCharAt(ret.length()-1,']');
		 ret = String.valueOf(str);				 
		 return ret; 
		 }

	public int size() {				
		return size;
	}

	public void addFirst(Object e) {
		add(0,e);
	}

	public void addLast(Object e) {
		add(size-1,e);				
	}

	public Object get(int a) {
		Object get = elementData[a];
		return get;
	}

	public void remove(int i) { 
		 for (int j = i; j < size - 1; j++) { 
		 elementData[j] = elementData[j + 1]; 
		 } 
		 elementData[size-1] = null; 
		 size--; 
		 }
	
	
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//add list
		list.add(" No1 ");
		list.add(" No2 ");
		list.add(" No3 ");
		list.add(" No4 ");
		System.out.println("add No1-No4 : " + list + "\n");
		
		//add data to array[2]
		list.add(2," No5 ");
		System.out.println("add No5 to array[2] : " + list + "\n");

		//add data to array[0]
		list.addFirst(" No6 ");
		System.out.println("add No6 to array[0] : " + list + "\n");

		//get size
		System.out.println("get Array length : "+ list.size() + "\n");

		//add data to arr[last]
		list.addLast(" No7 ");	
		System.out.println("add No7 to arr[last] : " + list + "\n");

		//get size
		System.out.println("get Array length : "+ list.size() + "\n");

		//remove arr[4]
		list.remove(4);
		System.out.println("remove arr[4] : " + list + "\n");

		//get size
		System.out.println("get Array length : "+ list.size() + "\n");

		// get array[2]
		System.out.println("get array[2] : " + list.get(2) + "\n");


	}

}
