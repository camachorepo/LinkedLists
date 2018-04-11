import java.util.Deque;
import java.util.LinkedList;

public class Append {

	public static void main (String[] args) {
		
		Deque<String> list = new LinkedList <String>();
		addElement(list, "Last Element");
		
		System.out.println(list);
	}
	
	public static void addElement(Deque<String> list, String element) {
		
		list.add(element);
		
	}
	
}
