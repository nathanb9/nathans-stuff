public class listNodes<T> {

	private T value;
	private listNodes<T> next;


	public listNodes() {
		value = null;
		next = null;
	}

	public listNodes(T newValue) {
		super();
		value = newValue;
		next = null;
	}

	public listNodes(T newValue, listNodes<T> newNext) {
		super();
		value = newValue;
		next = newNext;
	}

	public listNodes<T> getNext() {
		return next;
	}

	public T getValue() {
		return value;
	}

	public void setNext(listNodes<T> newNext) {
		next = newNext;
	}

	public T setValue(T newValue) {
		value = newValue;
		return value;
	}

	public int size() {
		int count = 0;
		if (value == null) {
			return 0;
		}
		else {
			listNodes<T> node = this;
			while(node != null) {
				count++;
				node = node.next;
			}
		}
		return count;
	}
	//toString
	public String toString() {
		String list = "";
		listNodes<T> node = this;
		while(node != null) {
			list += node.getValue();
			list += ",";
			node = node.next;
		}
		return "[" + list + "]";
	}
	//print
	public void printList() {
		System.out.println(toString());
	}

	//addFirst
	public listNodes<T> addFirst(T value) {
		return this.add(0, value);
	}
	//addLast
	public listNodes<T> addLast(T value){
		return this.add(this.size()-1, value);
	}
	//our add
	public listNodes<T> add(int pos, T newValue){
		listNodes<T> current = this;

		if (pos == 0) {
			listNodes<T> temp = current.next;
			current.next = new listNodes<T>(newValue, current.next);
			current = current.next;
			current.next = temp;
			return this;
		}

		for (int i = 0; i < pos-1; i++) {
			current = this.next;
		}

		listNodes<T> temp = current.next;
		current.next = new listNodes<T>(newValue, current.next);
		current = current.next;
		current.next = temp;
		return this;
	}
	//removeLast
	public listNodes<T> removeLast() {
		int listSize = this.size();
		listNodes<T> current = this;
		for(int i = 0; i < listSize-2; i++) {
			current = current.next;
		}
		listNodes<T> temp = current.next;
		current.setNext(null);
		return temp;
	}
	//get
	public T get(int pos) {
		listNodes<T> current = this;
		if (this.size() < pos) {
			return null;
		}
		for (int i = 0; i < pos; i++) {
			current = current.getNext();
		}
		return current.value;
	}
	//removeFirst
	public listNodes<T> removeFirst() {
		listNodes<T> newFirst = this.next;
		this.value = null;
		this.next = null;
		return newFirst;
	}


	public T peek(){
		return this.value;
	}
	//clear
	public void clear() {
		this.next = null;
		this.value = null;
	}
	//contains
	public listNodes<T> contains(T value) {
		listNodes<T> current = this;
		while( current.getValue() != value && current.getNext() != null) {

			current = current.getNext();
		}
		if(current.getValue() == value) {
			return current;
		}
		return null;
	}

	//getFirst
	public T getFirst() {
		return value;
	}
	//getLast
	public T getLast() {
		return get(size()-1);
	}

}
