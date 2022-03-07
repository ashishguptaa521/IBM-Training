import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PersonStreams extends Person {

	public static void main(String[] args) {

		TreeSet<Person> people = new TreeSet<Person>();
		people.add(new Person("Pole", 12));
		people.add(new Person("Cole", 10));
		people.add(new Person("Lilly", 32));
		int n = people.size();
		int arr[] = new int[n];

		int i = 0;

		for (Person ele : people)
			arr[i++] = ele.getAge();
		for (int res : arr) {

		}
		System.out.println();

		// IntStream intStream = IntStream.of(people.age);
		List<Person> lst = people.stream().filter(p -> p.getAge() > 10).collect(Collectors.toList());
		for (Person ele : lst) {
			System.out.println(ele.getName() + " " + ele.getAge());
		}

	}
}