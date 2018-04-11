import java.util.Deque;
import java.util.LinkedList;

public class Iterate {
	public static void main (String[] args) {
		
		Deque<String> list = new LinkedList <String>();
		list.addLast("First Element");
		list.addLast("Last Element");

		iterate(list);		
	}
	
	public static void iterate(Deque<String> list) {
		
		for(String s : list) {
			
			System.out.println(s);
			
		}
	}
}
