import java.util.Deque;
import java.util.LinkedList;

public class InsertAtFront {

	
	public static void main (String[] args) {
		
		Deque<String> list = new LinkedList <String>();
		addElement(list, "First Element");
		
		System.out.println(list);
	}
	
	public static void addElement(Deque<String> list, String element) {
		
		list.addFirst(element);
		
	}
}
