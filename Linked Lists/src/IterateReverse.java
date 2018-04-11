import java.util.LinkedList;
import java.util.Stack;

public class IterateReverse {

		public static void main (String[] args) {
			
			LinkedList<String> list = new LinkedList <String>();
			list.addLast("First Element");
			list.addLast("Middle Element");
			list.addLast("Last Element");

			iterateFromReverse(list);
			
		}
		
		
		public static void iterateFromReverse(LinkedList <String> list) {
			
			for(int i = list.size()-1; i >= 0; i--) {
				System.out.println(list.get(i));
			}
			
		}
	
}
