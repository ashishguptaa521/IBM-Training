package new_features;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {
	public static void print(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		Consumer<String> c1 = (s) -> System.out.println(s);
		c1.accept("Hello!");

		Consumer<String> c2 = System.out::println;
		c2.accept("Bonjour!");

		Consumer<String> c3 = LambdaDemo::print; // Method reference , we just passed the reference to the method and
													// it'll take care of the rest
		c3.accept("Aloha!");

		Supplier<String> s1 = () -> "Adios!";
		System.out.println(s1.get());

		Supplier<Integer> s2 = () -> (int) (Math.random() * 100);
		System.out.println(s2.get());

		Predicate<Integer> positive = (x) -> x >= 0;
		System.out.println(positive.test(4));

		String email = "ash123@email.com";
		BiPredicate<String, String> contains = (s, c) -> s.contains(c);
		System.out.println(contains.test(email, "@"));

		Function<Integer, Integer> square = (x) -> x * x;
		System.out.println(square.apply(6));

		BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
		System.out.println(sum.apply(10, 45));
	}

}
