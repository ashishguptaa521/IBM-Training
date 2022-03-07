import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionDemo {
	public static void main(String[] args) {

		LinkedList<String> lst = new LinkedList<String>();
		lst.add("Microsoft");
		lst.add("Google");
		lst.addFirst("Apple");
		lst.addLast("Adobe");
		lst.add(2, "Android");

		System.out.println("--Iterating using for loop:");
		for (int i = 0; i < lst.size(); i++)
			System.out.println(lst.get(i));

		System.out.println("--Iterating using iterator:");
		Iterator<String> itr = lst.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		System.out.println("--Iterating using for each loop:");
		for (String s : lst)
			System.out.println(s);

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("IBM");
		ar.add("Apple");
		ar.add("JBoss");
		ar.addAll(lst);// Merging a collection in another
		System.out.println("--Iterating over merged collection:");
		for (String e : ar)
			System.out.println(e);

		HashSet<String> set = new HashSet<String>(ar);
		System.out.println("--Iterating over set collections.");
		for (String e : set)
			System.out.println(e);

		TreeSet<String> tr = new TreeSet<String>(ar);
		System.out.println("--Iterating over set collections.");
		for (String e : tr)
			System.out.println(e);

	}

}
