import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class MapsDemo {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("Scott", "Tiger");
		map.put("Jack", "Jill");
		map.put("Polo", "Lilly");
		map.put("Jack", "Rose");

		System.out.println("Scott : " + map.get("Scott"));
		System.out.println("Jack : " + map.get("Jack"));

		System.out.println(Collections.singletonList(map)); // Using collections function

		System.out.println(Arrays.asList(map)); // Using array functions

		for (Object x : map.keySet()) {
			System.out.println(x + " - " + map.get(x));

		}
	}
}
