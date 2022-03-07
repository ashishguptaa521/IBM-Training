import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo3 {

	public static void process(int i) {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) {

		List<Integer> numbers = IntStream.range(1, 99).boxed().collect(Collectors.toList());

		long startTime = System.currentTimeMillis();
		numbers.stream().forEach(StreamDemo3::process);
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by sequencial stream : " + (endTime - startTime));

		startTime = System.currentTimeMillis();
		numbers.parallelStream().forEach(StreamDemo3::process);
		endTime = System.currentTimeMillis();
		System.out.println("Time taken by parallel stream : " + (endTime - startTime));
	}

}
