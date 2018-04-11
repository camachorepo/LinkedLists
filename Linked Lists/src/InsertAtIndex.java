import java.util.LinkedList;

public class InsertAtIndex {

	public static void main (String[] args) {
		
		LinkedList<String> list = new LinkedList <String>();
		list.addLast("First Element");
		list.addLast("Middle Element");
		list.addLast("Last Element");
		
		insert(list, "Inserted Element", 2);

		System.out.println(list);

	}
	
	
	public static void insert(LinkedList<String> list, String element, int index) {
		
		list.add(index, element);
	}
	
}
