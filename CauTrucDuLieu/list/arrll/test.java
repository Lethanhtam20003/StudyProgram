package arrll;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class test {

	public static void main(String[] args) {
		String[] i = { "11", "12", "13", "14", "15", "16" };
		Iterator<String> i2 = Arrays.asList(i).iterator();
		
		while (i2.hasNext()) {
			System.out.println(i2.next());
			System.out.println(i2.next());
			System.out.println(i2.next());
			System.out.println(i2.next());
			System.out.println(i2.next());
			System.out.println(i2.next());
			
		}
		
	}
}
