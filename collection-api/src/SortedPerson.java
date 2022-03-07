import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {
	public static void main(String[] args) {

//		Comparator<Person> compAge = (p1, p2) -> p1.getAge() - p2.getAge(); // Using comparator method which returns int
		// value; otherwise TreeSet gets confused
		// which parameter to use while sorting as
		// we're providing two parameters

		Comparator<Person> compName = (p1, p2) -> p1.getName().compareTo(p2.getName());
		TreeSet<Person> people = new TreeSet<>(compName);
		people.add(new Person("Polo", 21));
		people.add(new Person("Jack", 20));
		people.add(new Person("Lilly", 23));

		for (Person p : people)
			System.out.println(p);
	}
}
