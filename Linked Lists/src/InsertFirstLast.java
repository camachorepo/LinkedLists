import java.util.Deque;
import java.util.LinkedList;



public class InsertFirstLast {

	
	public static void main (String[] args) {
		
		Deque<String> list = new LinkedList <String>();
		
		insertFirstLast(list, "FirstandLastElement");
		
		System.out.println(list);
	}
	
	public static void insertFirstLast(Deque <String> list, String element) {
		
		list.push(element);
		
	}
}
