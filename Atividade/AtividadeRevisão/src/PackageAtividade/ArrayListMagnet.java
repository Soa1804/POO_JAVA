package PackageAtividade;
import java.util.ArrayList;
public class ArrayListMagnet {
	public static void printList(ArrayList<String> list) {
		for(String element: list) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add(0, "Zero");
		a.add(1, "One");
		a.add(2, "Two");
		a.add(3, "Three");
		printList(a);
		
		a.remove(2);
		if(a.contains("Three")) {
			a.add("Four");
		}
		printList(a);
		
		if(a.indexOf("Four")!=4) {
			a.add(4, "4.2");
		}
		printList(a);
		
		printList(a);
	}
}