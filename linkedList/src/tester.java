
public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num= 7;
		listNodes<Integer>test = new listNodes<Integer>(1);
		test.addFirst(2);
		System.out.println(test.toString());
		test.addLast(7);
		System.out.println(test.toString());
		test.addFirst(0);
		System.out.println(test.toString());
		System.out.println("PEEK:" + test.peek());
		System.out.println("getFirst:" + test.getFirst());
		System.out.println("getLast:" + test.getLast());
		test.add(0, 4);
		System.out.println("contains :" + test.contains(3));
		test.setValue(8);
		System.out.println("set value 8 : " + test.toString());
		test.clear();
		System.out.println(test.toString());
		System.out.println("cleared");
	}

}
