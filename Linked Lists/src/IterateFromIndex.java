import java.util.LinkedList;

public class IterateFromIndex {
	public static void main (String[] args) {
		
		LinkedList<String> list = new LinkedList <String>();
		list.addLast("First Element");
		list.addLast("Middle Element");
		list.addLast("Last Element");
		
		iterateFromIndex(list, 1);
		
	}
	
	
	public static void iterateFromIndex(LinkedList <String> list, int index) {
		
		for(int i = index; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
