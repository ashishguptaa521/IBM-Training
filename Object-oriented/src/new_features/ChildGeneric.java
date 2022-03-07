package new_features;

public class ChildGeneric<A, B> extends Generic<A> {
	private B b;

	public ChildGeneric(A data, B b) {
		super(data);
		this.b = b;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public static void main(String[] args) {
		ChildGeneric<String, Integer> c1 = new ChildGeneric<String, Integer>("Polo", 21);
		System.out.println(c1.getData() + "\t" + c1.getB());
	}
}
