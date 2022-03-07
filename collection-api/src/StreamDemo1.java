import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		Integer[] arr = { 2, 5, 7, 6, 8, 2, 3, 4 };
		// Convert an array into a list of integers
		List<Integer> numbers = Arrays.asList(arr);
//		// New way to iterate over collections
//		numbers.forEach(System.out::println);
//		
//		//Creating stream for numbers list
//		Stream<Integer> str1 = numbers.stream();
//		str1.forEach(System.out::println);		//Terminal operation
//		//Performing operation again shall give an error as stream is closed as terminal operation is performed.
//		str1.forEach(System.out::println);

		// Shorthand to do the same
		numbers.stream().forEach(System.out::println);
		System.out.println("\n");

		// Performing intermediate operation
		numbers.stream().distinct().forEach(System.out::println); // for printing the distinct elements
		System.out.println("\n");
		System.out.println(numbers.stream().distinct().count()); // count() is terminal operation
		System.out.println("\n");

		// Sorting distinct values before printing
		numbers.stream().distinct().sorted().forEach(System.out::println); // Sorted is intermediate
		System.out.println("\n");

		// Calculating sum of numbers in two ways
		System.out.println(numbers.stream().distinct().reduce(0, (a, b) -> a + b));
		System.out.println("\n");
		System.out.println(numbers.stream().distinct().reduce(0, Integer::sum));
		System.out.println("\n");

		// Creating and working with stream of numbers
		System.out.println(IntStream.range(0, 99).count());
		System.out.println(IntStream.range(1, 9).sum());
		System.out.println(IntStream.range(1, 9).skip(5).sum()); // Skipped 1 to 5
		System.out.println("\n");

		// Common statistics on integer stream
		IntStream str = IntStream.of(2, 5, 7, 6, 8, 2, 3, 4);
		IntSummaryStatistics stats = str.summaryStatistics();
		System.out.println(stats);
		System.out.println("\n");

	}
}
