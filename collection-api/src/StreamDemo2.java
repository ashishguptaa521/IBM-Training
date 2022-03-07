import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {
	public static void main(String[] args) {
		List<String> basket = Arrays.asList("Mango", "Banana", "Apple", "Papaya", "Orange");
		basket.forEach(System.out::println);
		System.out.println("\n");

		basket.stream().forEach(System.out::println);
		System.out.println("\n");

		Stream<String> str = Stream.of("Mango", "Banana", "Apple", "Papaya", "Orange");
//		str.sorted().forEach(System.out::println);
		System.out.println("\n");

		// str.map(s -> s.toUpperCase()).forEach(System.out::println);
		str.filter(s -> s.contains("a")).forEach(System.out::println);
		System.out.println("\n");

	}

}
