package new_features;

@FunctionalInterface
interface Maths {
//	int square(int n);
	int sum(int a, int b);
//	boolean isOdd(int n);
}

public class MathsDemo {
	public static void main(String[] args) {
//		Maths m1 = (n) -> n*n;

//		Maths m2 = (n) -> {
//			int sqr = n*n;
//			return sqr;
//		};

//		System.out.println(m1.square(10));

//		Maths o1 = (n) -> n % 2 != 0 ? true : false;
//		System.out.println(o1.isOdd(2));
//		System.out.println(o1.isOdd(3));

		Maths s1 = (a, b) -> a + b;
		System.out.println(s1.sum(3, 4));
	}

}
